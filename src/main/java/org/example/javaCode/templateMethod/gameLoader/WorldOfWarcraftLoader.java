package org.example.javaCode.templateMethod.gameLoader;

public class WorldOfWarcraftLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading world of warcraft local data...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating world of warcraft objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading world of warcraft  additional files...");
    }

    @Override
    void initProfiles() {
        System.out.println("Init world of warcraft profiles...");
    }
}
