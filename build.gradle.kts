plugins {
    java
    id("org.springframework.boot") version "2.7.11"
    id("io.spring.dependency-management") version "1.1.0"
}

java { toolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

sourceSets { main { resources { srcDirs += srcDir("src/main/clojure") } } }

repositories {
    mavenLocal()
    maven {
        name = "Clojars"
        url = uri("https://clojars.org/repo")
    }
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework:spring-websocket")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    implementation("io.projectreactor.tools:blockhound:1.0.8.RELEASE")
    implementation("io.projectreactor:reactor-tools")
    implementation("org.clojure:clojure:1.11.1")
    implementation("org.msync:spring-boost:0.2.0")
    implementation("compojure:compojure:1.7.0")
}
