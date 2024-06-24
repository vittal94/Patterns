package org.example.javaCode.state.developerDay;



public class Developer {
    private Activity activity;
    public Developer(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity() {
        switch (activity) {
            case Sleeping sleeping -> activity = new Training();
            case Training training -> activity = new Coding();
            case Coding coding -> activity = new Reading();
            case null, default -> activity = new Sleeping();
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
