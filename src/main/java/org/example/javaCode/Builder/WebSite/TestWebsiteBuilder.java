package org.example.javaCode.Builder.WebSite;

public class TestWebsiteBuilder {
   public static void run() {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebsiteBuilder());

        WebSite webSite = director.buildWebsite();
        System.out.println(webSite);
    }
}
