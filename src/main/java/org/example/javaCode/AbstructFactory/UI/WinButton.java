package org.example.javaCode.AbstructFactory.UI;



public class WinButton implements Button
{
    Color color;
    int width;
    int height;

    @Override
    public void setColor(int code) {
        if(color == null) {
            color = new Color(code);
        }
        else
            color.color = code;
    }

    @Override
    public void setSize(int x, int y) {
       width = x;
       height = y;
    }

    @Override
    public String getProperties() {
        return "WIN_color id is:" + color.color + " width is " + width
                + " height is " + height;
    }
    static class Color
    {
        int color;
        Color(int color) {
            this.color = color;
        }
    }
}
