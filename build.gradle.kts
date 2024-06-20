plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // retrofit
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation ("com.squareup.retrofit2:retrofit:2.1.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.1.0")

// Junit
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.0.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.0.0")
// to run JUnit 3/4 tests:
    testImplementation("junit:junit:4.12")
    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:4.12.0")
}

tasks.test {
    useJUnitPlatform()
}