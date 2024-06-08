plugins {
    id("microsphere-devops-library")
}

description = "Microsphere DevOps Repository"

dependencies {
    api(project(":microsphere-devops-api"))

    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
}
