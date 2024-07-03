package org.example.javaCode.templateMethod.website;

public class NewsPage extends WebsiteTemplate{
    @Override
    protected void showContent() {
        System.out.println("News");
    }
}
