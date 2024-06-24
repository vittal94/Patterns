package org.example.javaCode.state.phone;

public class Phone {
    private State state;

    public Phone() {
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String lock() {
        return "Locking phone and turning off the screen.";
    }

    public String home() {
        return "Going to home screen.";
    }

    public String unlock() {
        return "Unlocking the phone to home.";
    }

    public String turnOn() {
        return "Turning screen on, device still locked.";
    }
}

