group = "org.example.desktop"
version = "1.0-DEV"

plugins {
    kotlin("jvm")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.ORACLE)
    }
}

dependencies {
    implementation(project(":shared"))
}