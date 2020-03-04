package taskLesson06;

import taskLesson06.animals.*;

public class animalActions {
    public static void main(String[] args) {
//Создать классы Собака и Кот с наследованием от класса Животное.
//Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//В качестве параметра каждому методу передается величина, означающая
//или длину препятствия (для бега и плавания), или высоту (для прыжков).
// Результатом выполнения действия будет печать в консоль.(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
// плавание: кот не умеет плавать, собака 10 м.).

        Animal[] listAnimals = {
                new Cat("Felix", "white and black", 8),
                new Dog("Polkan", "black", 7),
                new Cat("Kasandra", "red", 5),
                new Dog("Violeta", "gray", 4)
        };

        for (Animal a : listAnimals) {
            if (a instanceof Cat) {
                a.run(200);
                a.swim(0);
                a.jump(2.0);
                System.out.println();
            }
            if (a instanceof Dog) {
                a.run(500);
                a.swim(10);
                a.jump(0.5);
                System.out.println();
            }

        }


//* Добавить подсчет созданных котов, собак и животных.

        Animal.quantityAnimal();
        Cat.quantityCat();
        Dog.quantityDog();

    }

}
