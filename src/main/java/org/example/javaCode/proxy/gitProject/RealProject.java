package org.example.javaCode.proxy.gitProject;

public class RealProject implements Project {
    private final String url;
    public RealProject(String url) {
        this.url = url;
        load();
    }
    private void load(){
        System.out.println("Loading project from url " + url + "...");
    }
    @Override
    public void run() {
        System.out.println("Running project from url " + url + "...");
    }
}
