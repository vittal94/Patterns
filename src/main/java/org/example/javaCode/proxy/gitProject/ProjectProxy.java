package org.example.javaCode.proxy.gitProject;

public class ProjectProxy implements Project{
    private RealProject realProject;
    private final String url;
    public ProjectProxy(String url) {
        this.url = url;
    }
    @Override
    public void run() {
       if(realProject == null) realProject = new RealProject(url);
       realProject.run();
    }
}
