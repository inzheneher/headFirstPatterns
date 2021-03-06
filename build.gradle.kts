plugins {
    java
    id("org.jetbrains.kotlin.jvm") version "1.3.21"
    id("info.solidsoft.pitest") version "1.4.0"
}

group = "org.mav"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(
            "org.springframework",
            "spring-context",
            "5.1.6.RELEASE")
    testImplementation("junit", "junit", "4.12")
    testImplementation("org.easytesting:fest-assert-core:2.0M10")
    testImplementation(
            "org.springframework",
            "spring-test",
            "5.1.6.RELEASE")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<Test> {
    maxParallelForks = (Runtime.getRuntime().availableProcessors() / 2).takeIf { it > 0 } ?: 1
    setForkEvery(100)
    reports.html.isEnabled = false
    reports.junitXml.isEnabled = false
}