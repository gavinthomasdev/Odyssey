plugins {
    id("java")
    id("application")
}

group = "dev.gavinthomas.odyssey"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

//repositories {
//    flatDir {
//        dirs("libs/**/libs")
//    }
//}

dependencies {
//    implementation(files("libs/terminal/libs/terminal-2.69.jar", "libs/jediterm-typeahead-2.69-SNAPSHOT.jar"))
    implementation(files("libs/jediterm-terminal-2.69.jar"))
    implementation("com.intellij:openapi:7.0.3")
    implementation("com.google.code.gson:gson:2.10")
    implementation("com.formdev:flatlaf:2.6")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {
    mainClass.set("dev.gavinthomas.odyssey.Odyssey")
}