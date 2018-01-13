package ex3;

import java.util.ArrayList;

public class Group {
    private int numofpart;
    private String groupname;
    private ArrayList<String> subject;
    private int passage;
    private ArrayList<Person> persons;

    public String getGroupname() {
        return groupname;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Group(int numofpart, String groupname, ArrayList<String> subject, int passage) {
        this.numofpart = numofpart;
        this.groupname = groupname;
        this.subject = subject;
        this.passage = passage;
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        boolean test = false;
        boolean added = false;
        if (person.getAge() > passage) {
            for (String sub : subject) {
                for (Skill skill : person.getSkill()) {
                    if (skill.getSkill().toString().equals(sub)) {
                        if (persons.size() < numofpart) {
                            persons.add(person);
                            test = true;
                            added = true;
                            System.out.println(person.getName() + " добавлен(а) в группу");
                            break;
                        } else {
                            test = true;
                            added = true;
                            System.out.println("Мест в группе для " + person.getName() + " нет");
                            break;
                        }
                    }
                    if (added)
                        break;
                }
            }
        } else {
            test = true;
            System.out.println("Возраст " + person.getName() + " не удовлетворяет требованиям группы");
        }

        if (!test) {
            System.out.println("Для " + person.getName() + " тематика данной группы не подходит");
        }
    }

}
