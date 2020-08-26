package taskLesson06.animals;

public class Dog extends Animal {
    private int limitRunDog = 500;
    private double limitJumpDog = 0.5;
    private int limitSwimDog = 10;
    private static int numberDog = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        numberDog++;
    }

// 3. У каждого животного есть ограничения на действия
// (бег: собака 500 м.; прыжок: собака 0.5 м.;
// плавание: собака 10 м.).

    @Override
    public void run(int distance) {
        if (distance <= limitRunDog && distance > 0) {
            super.run(distance);
        } else {
            System.out.printf("%s не сможет пробежать %d м.%n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= limitSwimDog && distance > 0) {
            super.swim(distance);
        } else {
            System.out.printf("%s не сможет проплыть %d м.%n", name, distance);
        }
    }

    @Override
    public void jump(double height) {
        if (height <= limitJumpDog && height > 0) {
            super.jump(height);
        } else {
            System.out.printf("%s не сможет прыгнуть %.2f м.%n", name, height);
        }
    }

    public static void quantityDog() {
        System.out.println("Всего собак: " + numberDog);
    }
}
