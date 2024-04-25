package org.example.javaCode.AbstructFactory.UI;

public class MacButton implements Button {
    int color;
    double height;
    double width;
    @Override
    public void setColor(int code) {
        color = code;
    }

    @Override
    public void setSize(int x, int y) {
         height =  y;
         width = x;
    }

    @Override
    public String getProperties() {
        return "MacButton color code is " +
                color + " height is " +
                height + " width is " + width;
    }
}
