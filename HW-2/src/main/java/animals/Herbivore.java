package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        System.out.println(food instanceof Grass ?
                "Grass is good!" + "\n" : "Herbivore don't eat meat!" + "\n");
    }
}
