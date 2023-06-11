public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }

    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    public void displayInfo() {
        System.out.printf("Rectangle with Side A = %.2f, Side B = %.2f:%n", sideA, sideB);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
        System.out.printf("Diagonal: %.2f%n", calculateDiagonal());
    }
}
