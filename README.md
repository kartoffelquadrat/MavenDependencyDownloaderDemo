# Maven Dependency Resolver Demo

Hands-On demo project to illustrate invokation of the [Maven Dependency Downloader].

## About

The [Maven Dependency Downloader]() is a library that resolves all transitive dependencies of a valid build artifact (defined by ```groupId```, ```artifactId```, ```version``` triplet), to the collection of JARs and stores those at a provided location on disk.  
This is a tiny demo project to illustrate how to use the library.

## Setup

 > **Note:** For convenience this repository contains a precompiled version of the MavenDependencyDownloader as JAR file.

 * Add the library JAR to your classpath or register it to your local build system repo.
   * Sample registration command:
```bash
```
   * Corresponding dependency block:  
```xml
```
 * Run this sample program:  
```bash
mvn clean exec:java
```

## Code

Inspect the [main class](...) for a demo usage of the Maven Dependency Resolver library.

## About

 * Author: Maximilian Schiedermeier ![email](email.png)
 * Github: Kartoffelquadrat
 * Webpage: https://www.cs.mcgill.ca/~mschie3
