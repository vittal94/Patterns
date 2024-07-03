package org.example.javaCode.templateMethod.website;

abstract public class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showContent();
        System.out.println("Footer");
    }

    abstract protected void showContent();
}
