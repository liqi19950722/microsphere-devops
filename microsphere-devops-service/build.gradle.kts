plugins {
    id("microsphere-devops-application")
    alias(libs.plugins.springbootGradlePlugin)
}

description = "Microsphere DevOps Service"

dependencies {
    implementation(project(":microsphere-devops-repository"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}
