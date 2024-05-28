package org.example.javaCode.command.smartHome;

public class TestSmartHome {
    public static void run() {
        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(
                new SwitchLightsCommand(new Light())
        );
        livingRoom.executeCommand();

        Room kitchen = new Kitchen();
        kitchen.setCommand(
                new SwitchFloorLightCommand(new FloorLight())
        );
        kitchen.executeCommand();
    }
}
