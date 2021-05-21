plugins {
    kotlin("jvm") version "1.5.0"
}

group = "br.com.tagliaferrodev"
version = "1.0"

repositories {
    mavenCentral()
}

val cucumberVersion by extra { "6.10.4" }

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("io.cucumber:cucumber-java8:${cucumberVersion}")
    testImplementation("io.cucumber:cucumber-junit:${cucumberVersion}")
}
