package com.example.studentregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentregister.databinding.ActivityMainBinding
import com.example.studentregister.db.Student
import com.example.studentregister.db.StudentDatabase

class MainActivity : AppCompatActivity() {
//    private lateinit var nameEditText: EditText
//    private lateinit var emailEditText: EditText
//    private lateinit var saveButton: Button
//    private lateinit var clearButton: Button

    private lateinit var viewModel: StudentViewModel
//    private lateinit var studentRecyclerView: RecyclerView
    private lateinit var adapter: StudentRecyclerViewAdapter
    private var isListItemClicked = false

    private lateinit var selectedStudent: Student

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
//        setContentView(view)
        setContentView(binding.root)

//        nameEditText = findViewById(R.id.etName)
//        emailEditText = findViewById(R.id.etEmail)
//        saveButton = findViewById(R.id.btnSave)
//        clearButton = findViewById(R.id.btnClear)
//        studentRecyclerView = findViewById(R.id.rvStudent)

        val dao = StudentDatabase.getInstance(application).studentDao
        val factory = StudentViewModelFactory(dao)
        viewModel = ViewModelProvider(this, factory).get(StudentViewModel::class.java)

        binding.apply{
            btnSave.setOnClickListener() {
                if (isListItemClicked) {
                    updateStudentData()
                    clearInput()
                } else {
                    saveStudentData()
                    clearInput()
                }
            }

            btnClear.setOnClickListener() {
                if (isListItemClicked) {
                    deleteStudent()
                    clearInput()
                } else {
                    clearInput()
                }

            }
        }

        initRecyclerView()
    }

    private fun saveStudentData(){

        binding.apply{
            viewModel.insertStudent(
                Student(
                    0,
                    etName.text.toString(),
                    etEmail.text.toString()
                )
            )
        }
    }

    private fun updateStudentData(){
        binding.apply{
            viewModel.updateStudent(
                Student(
                    selectedStudent.id,
                    etName.text.toString(),
                    etEmail.text.toString()
                )
            )


            btnSave.text = "Save"
            btnClear.setText("Clear")
            isListItemClicked = false
        }
    }

    private fun deleteStudent(){
        binding.apply{
            viewModel.deleteStudent(
                Student(
                    selectedStudent.id,
                    etName.text.toString(),
                    etEmail.text.toString()
                )
            )

            btnSave.text = "Save"
            btnClear.setText("Clear")
            isListItemClicked = false
        }
    }

    private fun clearInput(){
        binding.apply{
            etName.text.clear()
            etEmail.text.clear()
        }
    }

    private fun initRecyclerView(){

            binding.rvStudent.layoutManager = LinearLayoutManager(this)
            adapter = StudentRecyclerViewAdapter { selectedItem: Student ->
                listItemClicked(selectedItem)
            }
            binding.rvStudent.adapter = adapter


        displayStudentsList()
    }

    private fun displayStudentsList(){
        viewModel.students.observe(this, {
            adapter.setList(it)
            adapter.notifyDataSetChanged()
        })
    }

    private fun listItemClicked(student : Student){
        //        Toast.makeText(this, "Name of the student is ${student.name}", Toast.LENGTH_LONG).show()
        binding.apply{
            selectedStudent = student
            btnSave.text = "Update"
            btnClear.setText("Delete")
            isListItemClicked = true

            etName.setText(selectedStudent.name)
            etEmail.setText(selectedStudent.name)
        }
    }
}