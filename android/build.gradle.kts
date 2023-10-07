plugins {
    id("com.android.application")
    kotlin("android")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
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
        buildConfig = true
        viewBinding = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":shared"))

    implementation("androidx.appcompat:appcompat:1.6.1")
}