/**
 * @class: Triangle
 * @author: Yousra bibi
 * @course: ITEC 2140 -05, 2023
 * @version: 1.0
 * @date: 02/09/2023
 * @description: this program will calculate the perimeter of a triangle.
 */


import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean primeNumber = number > 1;
        for (int i = 2; i < number; i++)
        {
            if(number % i ==0)
            {
                primeNumber = false;
            }
        }
        if (primeNumber)
        {
            System.out.println(number + " is a prime number");
        }
        else
        {
            System.out.println(number + " is not a prime number");
        }
    }
}
