package OOP.GeometricFigures;

public class Rectangle extends GeometricsFigure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getSquare() {
        return this.a * this.b;
    }

    @Override
    public int getPerimeter() {
        return (this.a + this.b) * 2;
    }
}