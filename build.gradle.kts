plugins {
    id("java")
    application
}

group = "com.github.opfrzen"
version = "1.0-SNAPSHOT"

application {
    mainClass = "com.github.opfrzen.Main"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }
    compileJava {
        options.encoding = "UTF-8"
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
}

tasks.test {
    useJUnitPlatform()
}
