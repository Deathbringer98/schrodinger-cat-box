import java.util.Scanner;

public class Cat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        double hBar = 1.055e-34; // Reduced Planck constant
        double m = 9.109e-31; // Mass of the particle (electron)
        double L = 1.0e-9; // Length of the box (in meters)

        // User input for quantum number n
        System.out.print("Enter the quantum number n: ");
        int n = scanner.nextInt();

        // Calculate energy eigenvalue
        double En = (Math.pow(Math.PI, 2) * Math.pow(n, 2) * hBar * hBar) / (2 * m * L * L);

        // Print energy eigenvalue
        System.out.println("Energy eigenvalue E_" + n + ": " + En + " Joules");

        // Print ASCII art of a cat and a box
        System.out.println("  /\\_/\\");
        System.out.println(" ( o.o )");
        System.out.println("  > ^ <");
        System.out.println(" /  _  \\");
        System.out.println("/_/ \\_\\");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");

        scanner.close();
    }
}