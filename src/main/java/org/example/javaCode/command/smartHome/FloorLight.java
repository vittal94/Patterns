package org.example.javaCode.command.smartHome;

public class FloorLight {
    private boolean switchOn;

    public void switchLight() {
        switchOn = !switchOn;
    }

    public boolean isSwitchOn() {
        return switchOn;
    }
}
