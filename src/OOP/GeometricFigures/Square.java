package OOP.GeometricFigures;

public class Square extends GeometricsFigure {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int getSquare() {
        return this.a * this.a;
    }

    @Override
    public int getPerimeter() {
        return this.a * 4;
    }
}
