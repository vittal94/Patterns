package org.example.javaCode.Adapter.DataBase;

public class JavaToDatabaseAdapter extends JavaApplication implements DataBase{
    @Override
    public void insert() {
        loadObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void update() {
       updateObject();
    }

    @Override
    public void select() {
        saveObject();
    }
}
