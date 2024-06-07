package org.example.javaCode.iterator.developerSkills;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Boris",skills);

        Iterator it = javaDeveloper.getIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
