package org.example.javaCode.AbstructFactory.UI;

public class WinUIFactory implements UIFactory
{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
