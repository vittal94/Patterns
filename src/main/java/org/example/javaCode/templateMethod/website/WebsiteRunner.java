package org.example.javaCode.templateMethod.website;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new WelcomePage();
        welcome.showPage();

        System.out.println("\n================\n");

        WebsiteTemplate news = new NewsPage();
        news.showPage();
    }
}
