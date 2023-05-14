package OOP.ClassDemo;

public class Tiger {
    String name;
    int weight;
    String color;
    String colorOfEyes;
    int age;

    public Tiger(String name, int weight, String color, String colorOfEyes, int age) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.colorOfEyes = colorOfEyes;
        this.age = age;
    }

    public Tiger(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        if (weight >= 1 && weight <= 350) {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println(this.name + " run");
    }

    public void sayMeow() {
        System.out.println(this.name + " say meow");
    }
}
