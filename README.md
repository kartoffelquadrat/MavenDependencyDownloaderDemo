# Maven Dependency Resolver Demo

Hands-On demo project to illustrate invocation of the [Maven Dependency Downloader](https://github.com/Explorew/maven-dependency-downloader).

## About

The [Maven Dependency Downloader](https://github.com/Explorew/maven-dependency-downloader) is a library that resolves all transitive dependencies of a valid build artifact (defined by ```groupId```, ```artifactId```, ```version``` triplet), to the collection of JARs and stores those at a provided location on disk.  
This is a tiny demo project to illustrate how to use the library.

## Setup

 * Follow the [build instructions of the Maven Dependency Downloader](https://github.com/Explorew/maven-dependency-downloader#build-instructions) library.  
 (This will create a maven artefact for the library in your local maven repository.)

 * Run this sample program:  
```bash
   mvn clean package exec:java
```

## Code

Inspect the [main class](src/main/java/eu/kartoffelquadrat/mdddemo/Launcher.java) for a demo usage of the Maven Dependency Resolver library.

## About

 * Author: Maximilian Schiedermeier ![email](email.png)
 * Github: Kartoffelquadrat
 * Webpage: https://www.cs.mcgill.ca/~mschie3
