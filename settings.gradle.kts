pluginManagement {
    repositories.gradlePluginPortal()
    includeBuild("gradle/plugins")
    includeBuild("gradle/platform")
}

rootProject.name = "microsphere-devops"

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.aliyun.com/repository/public")
        }
        maven {
            url = uri("https://oss.sonatype.org/content/repositories/releases/")
        }
        maven {
            url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
        }
        mavenCentral()
    }
}

//include(":microsphere-devops-api")