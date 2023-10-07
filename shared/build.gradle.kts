group = "org.example.shared"
version = "1.0-DEV"

plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

kotlin {
    androidTarget()

    jvm("desktop")

    sourceSets {
        val androidMain by getting

        val desktopMain by getting

        val commonMain by getting
    }
}

android {
    namespace = "org.example.shared"
    compileSdk = 33
}