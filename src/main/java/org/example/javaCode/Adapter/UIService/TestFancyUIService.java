package org.example.javaCode.Adapter.UIService;

public class TestFancyUIService {
    public static void run() {
        IMultiRestoApp multiRestoApp = new MultiRestaApp();
        multiRestoApp.displayMenus(new XmlData("some menus"));

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(new XmlData("some menus"));
    }
}
