package model;

public class MyCat {
    private int full = 12;

    private int prettiness;

    private String name;

    private float weight;

    private String meow;

    private static int catCount = 0;

    private boolean eat;

    public MyCat() {
        catCount++;
    }

    public MyCat(int prettiness, String name, float weight, String meow) {
        catCount++;
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public void setCat(int prettiness, String name, float weight, String meow) {
        setPrettiness(prettiness);
        setName(name);
        setWeight(weight);
        setMeow(meow);
    }

    public void liveAnotherDay() {
        int randomInt = (int) (Math.random() * 5 + 1);

        for (int i = 0; i < 24; i++) {
            switch (randomInt) {
                case (1):
                    if (full != 0) {
                        System.out.println("The cat is playing - " + play() + "\n");
                        full--;
                    } else {
                        feedCat();
                    }

                    randomInt = (int) (Math.random() * 5 + 1);
                    break;

                case (2):
                    if (full != 0) {
                        System.out.println("The cat is running - " + run() + "\n");
                        full--;
                    } else {
                        feedCat();
                    }

                    randomInt = (int) (Math.random() * 5 + 1);
                    break;

                case (3):
                    if (full != 0) {
                        System.out.println("The cat is sleeping - " + sleep() + "\n");
                        full--;
                    } else {
                        feedCat();
                    }

                    randomInt = (int) (Math.random() * 5 + 1);
                    break;

                case (4):
                    if (full != 0) {
                        System.out.println("The cat is jumping - " + jump() + "\n");
                        full--;
                    } else {
                        feedCat();
                    }

                    randomInt = (int) (Math.random() * 5 + 1);
                    break;

                case (5):
                    if (full != 0) {
                        System.out.println("The cat is screaming like a demon...OMG! - " + screamLikeADemon() + "\n");
                        full--;
                    } else {
                        feedCat();
                    }

                    randomInt = (int) (Math.random() * 5 + 1);
                    break;
            }
            if (full <= 0) {
                System.out.println("Is the cat screaming? - " + screamLikeADemon());
                System.out.println("Is the cat jumping? - " + jump());
                System.out.println("Is the cat sleeping? - " + sleep());
                System.out.println("Is the cat running? - " + run());
                System.out.println("Is the cat playing? - " + play());
                System.out.println("The cat says 'Meow-meow! (Feed me!)'");
            }
        }
    }

    public void feedCat() {
        System.out.println("Feeding our lovely cat...");
        System.out.println("The cat is eating. - " + eat() + " - It's not hungry yet..." + "\n");
    }

    public boolean eat(int food) {
        full += food;
        return eat;
    }

    public boolean eat(int food, String foodName) {
        full += food;
        return eat;
    }

    public boolean eat() {
        eat(4, "treat");
        return eat;
    }

    public boolean play() {
        return full > 0;
    }

    public boolean sleep() {
        return full > 0;
    }

    public boolean run() {
        return full > 0;
    }

    public boolean jump() {
        return full > 0;
    }

    public boolean screamLikeADemon() {
        return full > 0;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public static int getCatCount() {
        return catCount;
    }
}
