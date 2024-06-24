package org.example.javaCode.state.developerDay;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer(activity);

        for(int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
