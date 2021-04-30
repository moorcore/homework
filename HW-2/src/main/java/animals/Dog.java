package animals;

public class Dog extends Carnivorous implements Run, Swim, Voice {
    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println("The dog is swimming!");
    }

    @Override
    public String voice() {
        return "Woof-woof!";
    }
}
