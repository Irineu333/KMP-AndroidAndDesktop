plugins {
    kotlin("multiplatform")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

kotlin {

    jvm {
        withJava()
    }

    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}