import io.github.microsphere.devops.metadata.Slf4JImplRule

plugins {
    `java-library`
    id("microsphere-devops-base")
}

configurations.all {
    resolutionStrategy.capabilitiesResolution.withCapability("org.slf4j", "slf4j-impl") {
        select("org.apache.logging.log4j:log4j-slf4j-impl:0")
    }
}

dependencies.components {
    withModule<Slf4JImplRule>("org.apache.logging.log4j:log4j-slf4j-impl")
    withModule<Slf4JImplRule>("ch.qos.logback:logback-classic")
}

dependencies {
    implementation(platform("io.github.microsphere-projects:platform"))
}

dependencies {
    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl")
}