import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Duck duck2 = new Duck();
        Fish fish = new Fish();
        Fish fish2 = new Fish();
        Horse horse = new Horse();
        Cat cat = new Cat();

        Beef beef = new Beef();
        Chicken chicken = new Chicken();
        Pork pork = new Pork();
        Clover clover = new Clover();
        Hay hay = new Hay();
        Sedge sedge = new Sedge();

        Worker worker = new Worker();

        System.out.println("Can we feed pork to ducks?");
        worker.feed(duck, pork);
        System.out.println("Can we feed chicken to dogs?");
        worker.feed(dog, chicken);
        System.out.println("Can we feed beef to horses?");
        worker.feed(horse, beef);
        System.out.println("Can we feed hay to fish?");
        worker.feed(fish, hay);
        System.out.println("Can we feed clover to cats?");
        worker.feed(cat, clover);
        System.out.println("Can we feed sedge to cows?");
        worker.feed(cow, sedge);

        ArrayList<Swim> pool = new ArrayList<>();

        pool.add(fish);
        pool.add(fish2);
        pool.add(duck);
        pool.add(duck2);

        for (Swim a : pool) {
            a.swim();
        }

        worker.getVoice(dog);
    }
}
