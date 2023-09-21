plugins {
    kotlin("multiplatform")
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