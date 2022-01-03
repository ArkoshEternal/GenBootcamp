import java.util.Scanner;

public class Average_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1, num2, num3;
        double average;
        num1 = keyboard.nextInt();  // read the first number
        num2 = keyboard.nextInt();  // read the second number
        num3 = keyboard.nextInt();  // read the third number
        average = (num1 + num2 + num3) / 3;
        System.out.println("Average is:");
        System.out.println(average);

    }
}
