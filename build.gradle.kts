plugins {
    kotlin("jvm") version "1.5.0"
    id("se.thinkcode.cucumber-runner") version "0.0.9"
}

group = "br.com.tagliaferrodev"
version = "1.0"

repositories {
    mavenCentral()
}

val cucumberVersion by extra { "6.10.4" }

cucumber {
    main = "io.cucumber.core.cli.Main"
    glue = "classpath:br.com.tagliaferrodev"
    featurePath = "src/test/resources"
    plugin = arrayOf("html:report.html")
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("io.cucumber:cucumber-java8:${cucumberVersion}")
    testImplementation("io.cucumber:cucumber-junit:${cucumberVersion}")
}