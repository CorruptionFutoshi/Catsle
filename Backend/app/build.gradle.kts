plugins {
    application
    war
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.google.guava:guava:32.1.3-jre")
    
    implementation ("org.mariadb.jdbc:mariadb-java-client:3.3.2")
    
    implementation ("org.slf4j:slf4j-simple:2.0.9")
    
    implementation ("jakarta.servlet:jakarta.servlet-api:6.0.0")
    
    implementation ("jakarta.json.bind:jakarta.json.bind-api:3.0.0")
    
    implementation ("org.eclipse:yasson:3.0.3") 
    
    implementation("redis.clients:jedis:5.1.0")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}