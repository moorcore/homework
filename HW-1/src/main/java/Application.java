import model.MyCat;

public class Application {
    public static void main(String[] args) {

        MyCat cat = new MyCat(5, "T-800", 45, "Meow-meow! (In cyborg-cat style)");
        MyCat cat2 = new MyCat();
        cat2.setCat(3, "T-1000", 48, "Meow! (In cyborg-cat style)");

        System.out.println("Our lovely cat has just eaten... Look!" + "\n");
        cat.liveAnotherDay();
        System.out.println("The cat has just lived another day!");
        System.out.println("___________________________________");

        boolean isIdenticalMeow = cat.getMeow().equals(cat2.getMeow());

        System.out.println("\n" + "The first cat's name is " + cat.getName());
        System.out.println("\n" + "The first cat's weight is " + cat.getWeight());

        System.out.println("\n" + "Do they meow identically? - " + isIdenticalMeow);

        System.out.println("\n" + "Number of created cats - " + MyCat.getCatCount());

    }
}
