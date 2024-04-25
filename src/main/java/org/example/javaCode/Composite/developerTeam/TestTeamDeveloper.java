package org.example.javaCode.Composite.developerTeam;

public class TestTeamDeveloper {
    public static void run() {
        Team team = new Team();

        Developer javaDev = new JavaDev();
        Developer kotlinDev  = new KotlinDev();
        Developer cppDev = new CppDev();

        team.addDeveloper(javaDev);
        team.addDeveloper(kotlinDev);
        team.addDeveloper(cppDev);

        team.createProject();
    }
}
