plugins {
    `java-platform`
}

group = "io.github.microsphere-projects"

javaPlatform.allowDependencies()

dependencies {
    api(platform(libs.microsphere.spring.cloud.dependencies))
    api(platform(libs.spring.boot.dependencies))
    api(platform(libs.spring.cloud.dependencies))
    api(platform(libs.spring.cloud.alibaba.dependencies))
}

dependencies.constraints {
    api(libs.javaxAnnotation)
    api(libs.findbugs)
    api(libs.curator)
    api(libs.bundles.apache.commons)
    api(libs.bundles.log4j2)
    api(libs.bundles.apollo)
    api(libs.bundles.alibaba)
    api(libs.bundles.mybatis)
    api(libs.bundles.jmh)
}