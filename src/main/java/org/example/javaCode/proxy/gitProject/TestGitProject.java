package org.example.javaCode.proxy.gitProject;

public class TestGitProject {
    public static void run() {
        Project project = new RealProject("https:/github.com/vittal94/gitProject");
        project.run();
        System.out.println("Using proxy project");

        Project project1 = new ProjectProxy("https:/github.com/vittal94/gitProject");
        project1.run();
    }
}
