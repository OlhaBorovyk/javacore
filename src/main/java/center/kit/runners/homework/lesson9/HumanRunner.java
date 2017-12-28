package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Human;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human(128, "Alex");
        System.out.println(human.setAge());
    }
}
