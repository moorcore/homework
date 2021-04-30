package animals;

public class Cow extends Herbivore implements Voice, Run, Swim {
    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return "Moo!";
    }

    @Override
    public void swim() {
        System.out.println("The cow is swimming!");
    }
}
