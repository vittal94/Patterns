package org.example.javaCode.Adapter.UIService;

public class MultiRestaApp implements IMultiRestoApp{
    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("multiRestaApp displaying menus " + xmlData.getData());
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("MultiRestaApp displaying recommendations " + xmlData.getData());
    }
}
