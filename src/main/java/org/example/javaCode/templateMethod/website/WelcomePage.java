package org.example.javaCode.templateMethod.website;

public class WelcomePage extends WebsiteTemplate{
    @Override
   protected void showContent() {
        System.out.println("Welcome");
    }
}
