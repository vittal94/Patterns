package org.example.javaCode.Adapter.DataBase;

public class DataBaseRunner {
    public static void testAdapter() {
        DataBase dataBase = new JavaToDatabaseAdapter();
        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.delete();
    }

}
