package taskLesson06.animals;

public class Animal {
    String name;
    String color;
    int age;
    static int numberAnimal = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        numberAnimal++;
    }
//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//   В качестве параметра каждому методу передается величина, означающая
//   или длину препятствия (для бега и плавания), или высоту (для прыжков).

    public void run(int distance) {
        System.out.printf("%s пробежал(-а) %d м.%n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s проплыл(-а) %d м.%n", name, distance);
    }

    public void jump(double height) {
        System.out.printf("%s прыгнул(-а) %.2f м.%n", name, height);
    }

    public static void quantityAnimal() {
        System.out.println("Всего животных: " + numberAnimal);
    }
}
