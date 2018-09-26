import java.util.Scanner;

public class Algebra_Solve2x2LinearEquations {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter the five values for a to f

        System.out.println("Please, enter the numbers: a, b, c, d, e and f");
        System.out.print("Enter number: a: ");
        int a = input.nextInt();

        System.out.print("Enter, number b: ");
        int b = input.nextInt();

        System.out.print("Enter, number c: ");
        int c = input.nextInt();

        System.out.print("Enter, number d: ");
        int d = input.nextInt();

        System.out.print("Enter, number e: ");
        int e = input.nextInt();

        System.out.print("Enter, number f: ");
        int f = input.nextInt();

        // Solving the equation

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        double test = (a * d - b * c);

        // Defining a boolian statement, where the result of the equation in x and y is displayed unless [ab-cd=0] is
        // the case, then it redirects to a print that says that the equation is unsolvable.
        System.out.println("x is: " + x);
        System.out.println("y is: " + y);

        if (test == 0 )
            System.out.println("a*b-b*c=" + test + " Therefore the equation has no solution");
        else
            System.out.println("The solution to the equation is: x=" + x + " and y=" + y);
    }
}
