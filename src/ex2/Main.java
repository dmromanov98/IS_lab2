package ex2;

public class Main {
    public static void main(String[] args) {
        Group[] groups = new Group[1];
        groups[0] = new Group(5, "Group 1", "English", 16);

        Person Andrew = new Person("Andrew", 18, new Skill[]{new Skill(Skill.skillType.English, 30),
                new Skill(Skill.skillType.Mathematics, 75)});
        groups[0].addPerson(Andrew);

        Person Kolya = new Person("Kolya", 15, new Skill[]{new Skill(Skill.skillType.Physics, 25),
                new Skill(Skill.skillType.English, 100)});
        groups[0].addPerson(Kolya);

        Person Anna = new Person("Anna", 20, new Skill[]{new Skill(Skill.skillType.Mathematics, 50),
                new Skill(Skill.skillType.Physics, 75)});
        groups[0].addPerson(Anna);

        Person Sergey = new Person("Sergey", 50, new Skill[]{new Skill(Skill.skillType.Physics, 75)});
        groups[0].addPerson(Sergey);

        Person Inna = new Person("Inna", 19, new Skill[]{new Skill(Skill.skillType.English, 100)});
        groups[0].addPerson(Inna);

        Person Alex = new Person("Alex", 18, new Skill[]{new Skill(Skill.skillType.English, 95),
                new Skill(Skill.skillType.Physics, 75)});
        groups[0].addPerson(Alex);

        Person Daria = new Person("Daria", 30, new Skill[]{new Skill(Skill.skillType.Physics, 25),
                new Skill(Skill.skillType.Physics, 75)});
        groups[0].addPerson(Daria);

        System.out.println();
        for (int i = 0; i < groups.length; i++) {
            System.out.println(groups[i].getGroupname() + " ; " + groups[i].getSubject() + " : ");
            for (Person p : groups[i].getPersons()) {
                if (p != null)
                    System.out.println("\t" + p.getName() + " " + p.getAge());
            }
        }
    }
}