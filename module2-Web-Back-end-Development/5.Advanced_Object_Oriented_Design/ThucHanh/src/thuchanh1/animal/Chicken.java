package thuchanh1.animal;

import thuchanh1.animal.Animal;
import thuchanh1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cuc...cuc...";
    }

    @Override
    public String howtoEat() {
        return "Could be fried ";
    }
}
