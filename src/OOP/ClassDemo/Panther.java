package OOP.ClassDemo;

public class Panther extends Feline {


    public Panther(String breed, String coloring, String homemade) {
        super(breed, coloring, homemade);
    }

    public Panther(String homemade, int tailLength) {
        super(homemade, tailLength);
    }

    @Override
    public void sleep() {
        breed = "panther";
        super.sleep();
    }

    @Override
    public void eat() {
        breed = "panther";
        super.eat();
    }
}
