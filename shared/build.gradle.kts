plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "org.example"
version = "1.0-DEV"

kotlin {
    targetHierarchy.default()

    androidTarget()

    sourceSets {
        val androidMain by getting

        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "org.example.shared"
    compileSdk = 33
}