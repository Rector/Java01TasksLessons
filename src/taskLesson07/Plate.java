package taskLesson07;

public class Plate {
    private int amountOfFood;

    public Plate(int amountOfFood){
        this.amountOfFood = amountOfFood;
    }

    public void foodInPlate(){
        System.out.println("Еды в тарелке: " + amountOfFood);
    }

    public void decreaseFood(int appetite){
        if(amountOfFood >= appetite){
            amountOfFood -= appetite;
        }
    }

    public int getAmountOfFood(){
        return amountOfFood;
    }

    public void addFoodInPlate(int food){
        amountOfFood += food;
        System.out.println("Еды в тарелке после добавления: " + amountOfFood);
    }

}
