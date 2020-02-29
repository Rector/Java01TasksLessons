package taskLesson06.animals;

public class Cat extends Animal {
    private int limitRunCat = 200;
    private double limitJumpCat = 2.0;
    static int numberCat = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        numberCat++;
    }

// 3. У каждого животного есть ограничения на действия
// (бег: кот 200 м.; прыжок: кот 2 м.;
// плавание: кот не умеет плавать).

    @Override
    public void run(int distance) {
        if (distance <= limitRunCat && distance > 0) {
            super.run(distance);
        } else {
            System.out.printf("%s не сможет пробежать %d м.%n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void jump(double height) {
        if (height <= limitJumpCat && height > 0) {
            super.jump(height);
        } else {
            System.out.printf("%s не сможет прыгнуть %.2f м.%n", name, height);
        }
    }

    public static void quantityCat() {
        System.out.println("Всего котов: " + numberCat);
    }
}
