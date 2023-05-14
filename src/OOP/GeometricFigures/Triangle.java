package OOP.GeometricFigures;

public class Triangle extends GeometricsFigure {
    int a;
    int b;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;

    }

    @Override
    public int getSquare() {
        return (this.a * this.h) / 2;
    }

    @Override
    public int getPerimeter() {
        return 2 * this.a + this.b;
    }
}
