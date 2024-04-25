package org.example.javaCode.Builder.WebSite;

public class VisitCardWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Visit card");
    }

    @Override
    void buildCms() {
      webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
       webSite.setPrice(500);
    }
}
