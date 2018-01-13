package ex2;


public class Group {
    private int numofpart;
    private String groupname;
    private String subject;
    private int passage;
    private Person[] persons;

    public String getGroupname() {
        return groupname;
    }

    public String getSubject() {
        return subject;
    }

    public Person[] getPersons() {
        return persons;
    }

    public Group(int numofpart, String groupname, String subject, int passage) {
        this.numofpart = numofpart;
        this.groupname = groupname;
        this.subject = subject;
        this.passage = passage;
        persons = new Person[numofpart];
    }

    public void addPerson(Person person) {
        if (person.getAge() > passage) {
            int i;
            for (i = 0; i < persons.length; i++)
                if (persons[i] == null) {
                    persons[i] = person;
                    System.out.println(person.getName() + " добавлен(а) в группу");
                    break;
                }
            if (i == persons.length)
                System.out.println("Мест в группе для " + person.getName() + " нет");
        } else
            System.out.println("Возраст " + person.getName() + " не удовлетворяет требованиям группы");
    }
}
