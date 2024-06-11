package org.example.javaCode.mediator.chat;

public class Admin implements User{
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMassage(String message) {
       chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name +  " receiving message: " + message + ".");
    }
}
