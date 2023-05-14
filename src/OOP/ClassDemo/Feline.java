package OOP.ClassDemo;

public class Feline {
    String breed;
    String coloring;
    String homemade;
    int tailLength;

    public Feline(String breed, String coloring, String homemade) {
        this.breed = breed;
        this.coloring = coloring;
        this.homemade = homemade;
    }

    public Feline(String homemade, int tailLength) {
        this.homemade = homemade;
        this.tailLength = tailLength;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setColoring(String coloring) {
        this.coloring = coloring;
    }

    public String getColoring() {
        return coloring;
    }

    public void setHomemade(String homemade) {
        if (homemade.equals("Yes") || homemade.equals("No")) {
            this.homemade = homemade;
        }
    }

    public String getHomemade() {
        return homemade;
    }

    public void setTailLength(int tailLength) {
        if (tailLength > 0 && tailLength < 45) {
            this.tailLength = tailLength;
        }
    }

    public int getTailLength() {
        return tailLength;
    }

    public void sleep() {
        System.out.println(breed + " sleep");
    }

    public void eat() {
        System.out.println(breed + " eat");
    }
}