package com.Command.Ex;

public class Main {
	public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: The light is on.

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: The light is off.
    }
}
