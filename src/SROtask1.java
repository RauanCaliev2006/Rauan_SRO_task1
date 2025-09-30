abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void work();
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " пишет код");
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void work() {
        System.out.println(name + " управляет командой");
    }
}

public class SROtask1 {
    public static void main(String[] args) {
        Developer d = new Developer("Рауан");
        Manager m = new Manager("Жанболат");

        d.work();
        m.work();
    }
}
