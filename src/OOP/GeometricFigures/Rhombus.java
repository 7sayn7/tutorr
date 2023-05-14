package OOP.GeometricFigures;

public class Rhombus extends GeometricsFigure {
    int a;
    int d1;
    int d2;

    public Rhombus(int a, int d1, int d2) {
        this.a = a;
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public int getSquare() {
        return (this.d1 * this.d2) / 2;
    }

    @Override
    public int getPerimeter() {
        return this.a * 4;
    }
}
