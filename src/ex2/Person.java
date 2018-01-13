package ex2;

class Skill {
    private skillType skill;
    private int skillLevel;

    enum skillType {Physics, English, Mathematics}

    public Skill(skillType skill, int skillLevel) {
        this.skill = skill;
        this.skillLevel = skillLevel;
    }

    public skillType getSkill() {
        return skill;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

}

public class Person {

    private String name;
    private int age;
    private Skill[] skills;

    public Person(String name, int age, Skill[] skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public Skill[] getSkill() {
        return skills;
    }

    public void setSkill(Skill[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
