package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        System.out.println(food instanceof Meat ?
                "Meat is great!" + "\n" : "Ew, grass!" + "\n");
    }
}
