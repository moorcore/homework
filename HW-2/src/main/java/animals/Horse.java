package animals;

public class Horse extends Herbivore implements Run, Swim, Voice {
    @Override
    public void run() {

    }

    @Override
    public void swim() {
        System.out.println("The horse is swimming!");
    }

    @Override
    public String voice() {
        return "Mhe-hew!";
    }
}
