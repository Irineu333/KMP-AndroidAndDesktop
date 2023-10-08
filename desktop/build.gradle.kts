import org.jetbrains.compose.desktop.application.dsl.TargetFormat

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

        nativeDistributions {

            targetFormats(
                //TargetFormat.Exe, // for executable
                TargetFormat.Msi // for installable
            )

            packageName = "Compose for Desktop"
            packageVersion = "1.0.0"

            outputBaseDir.set(file("build/compose/binaries"))

            windows {
                menu = true
                // see https://wixtoolset.org/documentation/manual/v3/howtos/general/generate_guids.html
                upgradeUuid = "6565BEAD-713A-4DE7-A469-6B10FC4A6861"
            }
        }
    }
}