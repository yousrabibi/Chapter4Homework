import java.util.Scanner;
public class studentGrades {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int grade = 1;
        while(sc.hasNextInt())
        {
            grade = sc.nextInt();
            sum += grade;
            count++;
        }
        double avg = (double)
                ((double) sum / (double) count);
        System.out.println("Average student grade is " + avg);
    }
}
