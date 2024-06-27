package org.example.javaCode.strategy.developerActivity;

public class Developer {
    private Activity activity;

    public Developer() {
        activity = new Sleeping();
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
