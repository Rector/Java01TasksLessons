package taskLesson05;

import java.util.Arrays;

public class ListOfEmployees {
    public static void main(String[] args) {
//* Создать массив из 5 сотрудников
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//        persArray[4] = new Person(...);


        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Surikov Petr Stepanowich", "Tiler",
                "surikov42@gmail.com", "89277462431", 35000.50, 28);
        persArray[1] = new Employee("Shchelokov Ivan Dmitrievich", "Mason",
                "shcel@mail.ru", "89178595043", 38000.40, 36);
        persArray[2] = new Employee("Sorokin Mikhail Yuryevich", "Carpenter",
                "sormik@yandex.ru", "89324672856", 40500.20, 42);
        persArray[3] = new Employee("Liberman Uri Karmielevich", "Foreman",
                "luk53@gmail.com", "89033794581", 42000.60, 53);
        persArray[4] = new Employee("Dolotov Aristarkh Viktorovich", "Director",
                "darivik@mail.ru", "89178000000", 99999.99, 35);

//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        int moreYears = 40;
        System.out.println("В строительной компании работают следующие сотрудники старше " + moreYears + " лет:");
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > moreYears) {
                persArray[i].infoEmployee();
            }
        }

        System.out.println();
        System.out.println("Всего в строительной компании работают " + persArray.length +
                " следующих сотрудников:");
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].infoEmployee();
        }
    }
}
