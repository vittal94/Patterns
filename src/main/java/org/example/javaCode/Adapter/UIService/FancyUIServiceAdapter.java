package org.example.javaCode.Adapter.UIService;

public class FancyUIServiceAdapter implements IMultiRestoApp{
    private final FancyUIService fancyUIService;
    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();
    }
    @Override
    public void displayMenus(XmlData xmlData) {
       JsonData jsonData = convertToJson(xmlData);
       fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
       JsonData jsonData = convertToJson(xmlData);
       fancyUIService.displayRecommendations(jsonData);
    }
    private JsonData convertToJson(XmlData xmlData) {
        return new JsonData(xmlData.getData());
    }
}
