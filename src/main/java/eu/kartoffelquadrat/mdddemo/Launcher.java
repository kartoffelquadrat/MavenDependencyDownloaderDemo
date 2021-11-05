package eu.kartoffelquadrat.mdddemo;

import yizhong.ding.mavendependencydownloader.ArtifactResolveException;
import yizhong.ding.mavendependencydownloader.DependencyResolver;

public class Launcher {

    public static void main(String[] args) throws ArtifactResolveException {

        // Artifact for which we want to collect all dependencies:
        String groupId = "eu.kartoffelquadrat";
        String artifactId = "asyncrestlib";
        String version = "1.5.2";

        // Where to store the dependencies (as JARs)
        // tmpdir will be used if null or empty
        String targetLocation = "/Users/schieder/Desktop/ARL-deps";

        // Call library to collect all dependencies
        DependencyResolver.resolveArtifact(groupId, artifactId, version, targetLocation);
    }
}