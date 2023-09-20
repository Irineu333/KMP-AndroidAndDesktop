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

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        buildConfig = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    // core
    implementation("androidx.appcompat:appcompat:1.6.1")

    // compose

    // Unit test
    testImplementation("junit:junit:4.13.2")

    // Instrumented test
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}