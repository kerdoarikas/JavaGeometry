import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA = Math.random() * 10 + 1;
        System.out.printf("The value for Side A is: %.2f\n", sideA);
        System.out.printf("Enter the value for Side B: ");
        double sideB = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(sideA, sideB);
        rectangle.displayInfo();

        scanner.close();
    }
}
