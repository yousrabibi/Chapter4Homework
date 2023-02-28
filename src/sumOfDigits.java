/**
 * @class: sumOfDigita
 * @author: Yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/28/2023
 * @description: this program will calculate the sum of digits entered.
 */
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int digit = num;
        int sum = 0;

        while(num != 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("The sum of digits of " + digit + " is " + sum);
    }
}

