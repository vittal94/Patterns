package org.example.javaCode.Adapter.UIService;

public class FancyUIService {
    public void displayMenus(JsonData jsonData) {
        System.out.println("FancyUIService displaying menus " + jsonData.getData());
    }

    public void displayRecommendations(JsonData jsonData) {
        System.out.println("FancyUIService displaying recommendations " + jsonData.getData());
    }
}
