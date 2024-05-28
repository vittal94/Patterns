package org.example.javaCode.command.dataBase;

public class DataBaseRunner{
    public static void test() {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase),
                new DeleteCommand(dataBase)
        );
        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
