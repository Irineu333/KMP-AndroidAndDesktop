plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "org.example.android"
    compileSdk = 33

    defaultConfig {
        applicationId = "org.example.android"

        minSdk = 24
        targetSdk = 33

        versionCode = 1
        versionName = "1.0-DEV"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        // Support kotlin 1.8.10
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        jvmToolchain(17)
    }
}

dependencies {

    implementation(project(":shared"))

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.activity:activity-compose:1.7.0")
}