interface Reportable {
    void generateReport();
}

interface Trainable {
    void attendTraining();
}

class Boss implements Reportable {
    String name;

    Boss(String name) {
        this.name = name;
    }

    public void generateReport() {
        System.out.println(name + " делает отчет");
    }
}

class Programmer implements Trainable {
    String name;

    Programmer(String name) {
        this.name = name;
    }

    public void attendTraining() {
        System.out.println(name + " проходит обучение");
    }
}

public class SROtask2 {
    public static void main(String[] args) {
        Boss b = new Boss("Рауан");
        Programmer p = new Programmer("Жанболат");

        b.generateReport();
        p.attendTraining();
    }
}
