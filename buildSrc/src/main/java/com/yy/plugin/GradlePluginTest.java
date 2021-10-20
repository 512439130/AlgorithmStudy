package com.yy.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GradlePluginTest implements Plugin<Project> {
    @Override
    public void apply(Project target) {
        System.out.println("> This is GradlePluginTest (buildSrc)");
    }
}
