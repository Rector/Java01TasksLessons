package taskLesson07;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getAmountOfFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void catCondition(){
        System.out.printf("Name Cat: %-10s Appetite: %-7d Satiety: %-7s%n", name, appetite, satiety);
    }

}
