package center.kit.app.homework.lesson9;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String setAge() {
        if (age >= 1 && age <= 120) {
            return "New age setted";
        } else {
            return "Age invalid";
        }
    }
}
