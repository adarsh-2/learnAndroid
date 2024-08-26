plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.ner"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ner"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

//    configurations.all {
//        resolutionStrategy.dependencySubstitution {
//            substitute module('org.hamcrest:hamcrest-core:1.1') with module('junit:junit:4.10')
//        }
//    }


}

// added by me

//configurations {
//    compile{
//        exclude group: 'junit', module: 'junit'
//    }
//}

configurations.all {
    resolutionStrategy.dependencySubstitution {
        substitute(module("org.hamcrest:hamcrest-core:1.1")).using(module("junit:junit:4.10"))
    }
}

// *********************************

dependencies {

    implementation("androidx.core:core-ktx:1.13.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // added by me
    implementation ("edu.stanford.nlp:stanford-corenlp:4.5.5")
//    testImplementation ("junit:junit:4.10")
//    androidTestImplementation ("org.awaitility:awaitility:3.1.6")
//    implementation ("edu.stanford.nlp:stanford-corenlp:4.5.5:models")
//    implementation ("edu.stanford.nlp:stanford-corenlp:4.5.5:models-english")
//    implementation ("edu.stanford.nlp:stanford-corenlp:4.5.5:models-english-kbp")

}