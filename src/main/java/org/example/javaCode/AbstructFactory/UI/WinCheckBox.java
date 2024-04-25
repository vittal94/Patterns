package org.example.javaCode.AbstructFactory.UI;

import java.text.MessageFormat;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint(int color) {
        System.out.println(
                MessageFormat.format("Windows checkbox are painting of color {0}" ,color)
        );
    }
}
