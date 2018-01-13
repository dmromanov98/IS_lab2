package ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Group> groups = new ArrayList();

        groups.add(new Group(5, "Group 1", new ArrayList<>() {{
            add("English");
            add("Physics");
        }}, 16));

        Person Andrew = new Person("Andrew", 18, new ArrayList<>() {{
            add(new Skill(Skill.skillType.Mathematics, 75));
        }});
        groups.get(0).addPerson(Andrew);

        Person Kolya = new Person("Kolya", 15, new ArrayList<>() {{
            add(new Skill(Skill.skillType.Physics, 25));
            add(new Skill(Skill.skillType.English, 100));
        }});
        groups.get(0).addPerson(Kolya);

        Person Anna = new Person("Anna", 20, new ArrayList<>() {{
            add(new Skill(Skill.skillType.Mathematics, 50));
            add(new Skill(Skill.skillType.Physics, 75));
        }});
        groups.get(0).addPerson(Anna);

        Person Sergey = new Person("Sergey", 50, new ArrayList<>() {{
            add(new Skill(Skill.skillType.Physics, 75));
        }});
        groups.get(0).addPerson(Sergey);

        Person Inna = new Person("Inna", 19, new ArrayList<>() {{
            add(new Skill(Skill.skillType.English, 100));
        }});
        groups.get(0).addPerson(Inna);

        Person Alex = new Person("Alex", 18, new ArrayList<>() {{
            add(new Skill(Skill.skillType.English, 95));
            add(new Skill(Skill.skillType.Physics, 75));
        }});
        groups.get(0).addPerson(Alex);

        Person Daria = new Person("Daria", 19, new ArrayList<>() {{
            add(new Skill(Skill.skillType.English, 100));
        }});
        groups.get(0).addPerson(Daria);

        Person Dmitry = new Person("Dmitry", 18, new ArrayList<>() {{
            add(new Skill(Skill.skillType.English, 95));
            add(new Skill(Skill.skillType.Physics, 75));
        }});
        groups.get(0).addPerson(Dmitry);

        System.out.println();
        for (Group g : groups) {
            System.out.println(g.getGroupname() + " ; " + g.getSubject() + " : ");
            for (Person p : g.getPersons())
                System.out.println("\t" + p.getName() + " " + p.getAge());
        }
    }
}