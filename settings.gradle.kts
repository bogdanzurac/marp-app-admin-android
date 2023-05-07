import java.net.URI

include(":app-elgoog")

pluginManagement {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = java.net.URI("https://maven.pkg.github.com/bogdanzurac/marp-android-packages")
            name = "GitHub"
            credentials {
                val properties = java.util.Properties()
                properties.load(file("project.properties").inputStream())
                username = properties["github.username"].toString()
                password = properties["github.passwordStep1"].toString() +
                        properties["github.passwordStep2"].toString()
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    versionCatalogs {
        create("libs") {
            from("dev.bogdanzurac.marp.build:libs:0.0.11")
        }
    }

    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://developer.huawei.com/repo/") }
        maven {
            url = URI("https://maven.pkg.github.com/bogdanzurac/marp-android-packages")
            name = "GitHub"
            credentials {
                val properties = java.util.Properties()
                properties.load(file("project.properties").inputStream())
                username = properties["github.username"].toString()
                password = properties["github.passwordStep1"].toString() +
                        properties["github.passwordStep2"].toString()
            }
        }
    }
}
