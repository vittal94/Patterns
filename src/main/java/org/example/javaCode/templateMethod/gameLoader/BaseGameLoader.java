package org.example.javaCode.templateMethod.gameLoader;

public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initProfiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initProfiles();
    protected void cleanTempFiles() {
        System.out.println("Cleaning temp files...");
    }
}
