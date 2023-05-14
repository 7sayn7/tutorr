package OOP.GeometricFigures;

public class Main {
    public static void main(String[] args) {
        GeometricsFigure[] geometricsFigures = new GeometricsFigure[4];
        geometricsFigures[0] = new Rectangle(3, 4);
        geometricsFigures[1] = new Rhombus(4,2, 6);
        geometricsFigures[2] = new Square(4);
        geometricsFigures[3] = new Triangle(5, 7);
        for (int i = 0; i < geometricsFigures.length; i++){
            System.out.println(geometricsFigures[i].getSquare());
        }
    }
}