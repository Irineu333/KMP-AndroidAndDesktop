plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "org.example.android"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.example.android"

        minSdk = 24
        targetSdk = 34

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

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10" // Compatible with Kotlin 1.9.22
    }

    kotlin {
        jvmToolchain(17)
    }
}

dependencies {

    implementation(project(":shared"))

    implementation(libs.androidx.activity.compose)
    implementation(libs.compose.ui.tooling.preview)
}