# Maven Dependency Resolver Demo

Hands-On demo project to illustrate invocation of the [Maven Dependency Downloader](https://github.com/Explorew/maven-dependency-downloader).

## About

The [Maven Dependency Downloader](https://github.com/Explorew/maven-dependency-downloader) is a library that resolves all transitive dependencies of a valid build artifact (defined by ```groupId```, ```artifactId```, ```version``` triplet), to the collection of JARs and stores those at a provided location on disk.  
This is a tiny demo project to illustrate how to use the library.

## Setup

 > **Note:** For convenience this repository contains a precompiled version of the [MavenDependencyDownloader as JAR file](MavenDependencyDownloader.jar).

 * Add the library JAR to your classpath or register it to your local build system repo.
   * Sample registration command:
```bash
   mvn install:install-file -Dfile=MavenDependencyDownloader.jar -DgroupId=yizhong.ding -DartifactId=maven-dependency-downloader -Dversion=1.1 -Dpackaging=jar -DcreateChecksum=true
```
   * Corresponding dependency block (already added to [pom.xml](pom.xml)):  
```xml
   <dependency>
       <groupId>yizhong.ding</groupId>
       <artifactId>maven-dependency-downloader</artifactId>
       <version>1.1.2</version>
   </dependency>
```
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
