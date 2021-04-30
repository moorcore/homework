package animals;

public class Duck extends Herbivore implements Run, Swim, Fly, Voice {
    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming!");
    }

    @Override
    public String voice() {
        return "Wack-wack!";
    }
}
