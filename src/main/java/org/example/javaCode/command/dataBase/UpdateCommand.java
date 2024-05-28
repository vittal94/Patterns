package org.example.javaCode.command.dataBase;

public class UpdateCommand implements Command{

    private DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.update();
    }
}
