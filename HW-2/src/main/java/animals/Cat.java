package animals;

public class Cat extends Carnivorous implements Run, Voice {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "Meow!";
    }
}
