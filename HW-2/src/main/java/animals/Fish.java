package animals;

public class Fish extends Herbivore implements Swim {
    @Override
    public void swim() {
        System.out.println("The fish is swimming!");
    }
}
