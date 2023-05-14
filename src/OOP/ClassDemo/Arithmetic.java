package OOP.ClassDemo;

public class Arithmetic {
    int a;
    int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return this.a + this.b;
    }

    public int product() {
        return this.a * this.b;
    }

    public int max() {
        if (this.a > this.b) {
            return this.a;
        } else {
            return this.b;
        }
    }
    public int min() {
        if (this.a > this.b) {
            return this.b;
        } else {
            return this.a;
        }
    }
}
