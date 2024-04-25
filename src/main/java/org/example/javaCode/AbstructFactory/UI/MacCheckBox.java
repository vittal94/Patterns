package org.example.javaCode.AbstructFactory.UI;

import java.text.MessageFormat;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint(int color) {
        System.out.println(
                MessageFormat.format("Mac checkbox is in {0} color",color)
        );
    }
}
