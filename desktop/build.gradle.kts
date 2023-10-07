group = "org.example.desktop"
version = "1.0-DEV"

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":shared"))
    implementation(compose.desktop.currentOs)
}


compose.desktop {
    application {
        mainClass = "org.example.desktop.MainKt"
    }
}