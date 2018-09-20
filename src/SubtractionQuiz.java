import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // The purpose of this program is to generate two random numbers and subtract the second from the first

        // Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        //Prompt the student to answer "What is number1 - number2?"
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        if (number1 - number2 == answer) {
            System.out.println("Soooo very true!!!");
        }
        else {
            System.out.println("You suck!!!");
            System.out.println(number1 + " - " + number2 + " Should be...." + (number1 - number2));
        }
    }
}
