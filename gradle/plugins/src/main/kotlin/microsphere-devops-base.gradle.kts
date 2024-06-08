plugins {
    java
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(8)
}

tasks.withType(JavaCompile::class).configureEach {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:all")
    options.compilerArgs.add("-parameters")
}

tasks.test {
    useJUnitPlatform()
}