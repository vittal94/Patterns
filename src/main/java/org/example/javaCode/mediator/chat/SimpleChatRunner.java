package org.example.javaCode.mediator.chat;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMassage("Hello I'm user1 and fuck you all assholes");
        admin.sendMassage("Hello user1, are you fucking stupid asshole???");
    }
}
