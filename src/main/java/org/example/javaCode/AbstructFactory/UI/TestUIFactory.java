package org.example.javaCode.AbstructFactory.UI;

public class TestUIFactory {
    public static void run() {
        var winApplication = new Application(new WinUIFactory());
        winApplication.setProperties(9,8);
        winApplication.getProperties();

        var macApplication = new Application(new MacUIFactory());
        macApplication.setProperties(9,5);
        macApplication.getProperties();

    }
    static class Application {
       private final Button button;
       private final CheckBox checkBox;
       public Application(UIFactory factory) {
           this.button = factory.createButton();
           this.checkBox = factory.createCheckBox();
         }
         public void setProperties(int buttonColor, int checkBoxColor) {
           button.setSize(45,245);
           button.setColor(buttonColor);
           checkBox.paint(checkBoxColor);
         }

         public void getProperties() {
             System.out.println(button.getProperties());
       }

    }
}
