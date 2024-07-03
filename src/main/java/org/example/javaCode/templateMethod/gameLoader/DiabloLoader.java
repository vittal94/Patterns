package org.example.javaCode.templateMethod.gameLoader;

public class DiabloLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading diablo local data...");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating diablo objects...");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading diablo additional files...");
    }

    @Override
    void initProfiles() {
        System.out.println("Init diablo profiles...");
    }
}
