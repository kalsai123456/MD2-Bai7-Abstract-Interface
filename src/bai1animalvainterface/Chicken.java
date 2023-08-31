package bai1animalvainterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: hoho";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
