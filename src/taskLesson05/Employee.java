package taskLesson05;

public class Employee {
//* Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

    private String fullName;
    private String position;
    private String eMail;
    private String telephone;
    private double wage;
    private int age;

//* Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String fullName, String position, String eMail, String telephone, double wage, int age){
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.telephone = telephone;
        this.wage = wage;
        this.age = age;
    }

//* Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

    public void infoEmployee(){
        System.out.printf("Full Name: %-35s Position: %-15s E-mail: %-25s Telephone: %-15s Wage: %-12.2f Age: %-3d%n",
                fullName, position, eMail, telephone, wage, age);
    }

    public int getAge() {
        return age;
    }
}
