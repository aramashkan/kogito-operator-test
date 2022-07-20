plugins {
    java
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project

dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:quarkus-kogito-bom:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-container-image-jib")
    implementation("org.kie.kogito:kogito-quarkus")
    implementation("io.quarkus:quarkus-smallrye-health")
    implementation("io.quarkus:quarkus-resteasy-jackson")
    implementation("org.kie.kogito:kogito-quarkus-processes")
    implementation("org.kie.kogito:kogito-addons-quarkus-monitoring-prometheus:1.23.0.Final")
    implementation("io.quarkus:quarkus-arc")
    testImplementation("io.quarkus:quarkus-junit5")
}

group = "org.acme"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}
