package OOP.ClassDemo;

public class Puma extends Feline{

    public Puma(String breed, String coloring, String homemade) {
        super(breed, coloring, homemade);
    }

    public Puma(String homemade, int tailLength) {
        super(homemade, tailLength);
    }

    @Override
    public void sleep() {
        breed = "puma";
        super.sleep();
    }

    @Override
    public void eat() {
        breed = "puma";
        super.eat();
    }
}
