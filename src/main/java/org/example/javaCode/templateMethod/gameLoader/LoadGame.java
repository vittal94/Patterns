package org.example.javaCode.templateMethod.gameLoader;

public class LoadGame {
    public static void main(String[] args) {
        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();

        System.out.println("\n===============\n");

        BaseGameLoader wofcl = new WorldOfWarcraftLoader();
        wofcl.load();
    }
}
