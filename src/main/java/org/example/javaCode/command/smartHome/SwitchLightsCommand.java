package org.example.javaCode.command.smartHome;

public class SwitchLightsCommand implements Command{
    private Light light;
    public SwitchLightsCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.setSwitchOn(true);
    }
}
