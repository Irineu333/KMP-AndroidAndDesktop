group = "org.example.shared"
version = "1.0-DEV"

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
}

kotlin {

    jvmToolchain(17)

    // targets

    android()

    jvm("desktop")

    // source sets

    sourceSets {
        val androidMain by getting {
            dependencies {
                api("androidx.compose.ui:ui-tooling-preview:1.4.3")
            }
        }

        val desktopMain by getting {
            dependencies {
                api(compose.preview)
            }
        }

        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.ui)
                implementation(compose.material)
            }
        }
    }
}

android {
    namespace = "org.example.shared"
    compileSdk = 33

    // Inject common resources into android
    // sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    // sourceSets["main"].res.srcDirs("src/androidMain/res")
    // sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        jvmToolchain(17)
    }
}