package org.example;


import org.example.javaCode.Adapter.DataBase.DataBaseRunner;
import org.example.javaCode.Adapter.Socket.Socket;
import org.example.javaCode.Adapter.UIService.TestFancyUIService;
import org.example.javaCode.Bridge.programmCreator.BankSystem;
import org.example.javaCode.Bridge.programmCreator.ProgrammeCreator;
import org.example.javaCode.Bridge.seller.Seller;
import org.example.javaCode.Composite.amazonDelivery.TestAmazonDelivery;
import org.example.javaCode.Composite.developerTeam.TestTeamDeveloper;
import org.example.javaCode.Prototype.Copyable.TestCopyable;
import org.example.javaCode.decorator.javaDev.TestJavaDev;
import org.example.javaCode.decorator.notificationService.TestNotifier;
import org.example.javaCode.facade.sprintRunner.SprintRunner;
import org.example.javaCode.flyweight.bookStore.TestBookStore;
import org.example.javaCode.flyweight.developer.ProjectRunner;

import java.text.NumberFormat;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int FLAG1 = 1;
    public static int FLAG2 = 2;
    public static int FLAG3 = 3;
    public static void main(String[] args) throws CloneNotSupportedException {
        //TestFactoryMethod.run();
       // TestUIFactory.run();
        //TestLogger.run();
        //TestWebsiteBuilder.run();
        //TestCarBuilder.run();
       // TestCopyable.run();
       // DataBaseRunner.testAdapter();
       // Socket.testSocket();
        //TestFancyUIService.run();
       // ProgrammeCreator.makeProgramme();
        //Seller.sell();
        //TestTeamDeveloper.run();
        //TestAmazonDelivery.run();
        //TestJavaDev.run();
       // TestNotifier.run();
       // SprintRunner.run();
        //ProjectRunner.run();
        TestBookStore.run();




    }



}






