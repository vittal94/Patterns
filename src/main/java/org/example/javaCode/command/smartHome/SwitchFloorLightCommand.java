package org.example.javaCode.command.smartHome;

public class SwitchFloorLightCommand implements Command{
    private FloorLight floorLight;

    public SwitchFloorLightCommand(FloorLight floorLight) {
        this.floorLight  = floorLight;
    }
    @Override
    public void execute() {
        floorLight.switchLight();
    }
}
