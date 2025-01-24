import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class DayOfWeak {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day(1-31):");
        int day = sc.nextInt();
        System.out.println("Enter the month(1-12):");
        int month = sc.nextInt();
        System.out.println("Enter the year(e.g. 2025):");
        int year = sc.nextInt();

        try {
            LocalDate date = LocalDate.of(year, month, day);

            DayOfWeek dayofweek = date.getDayOfWeek();
            System.out.println("The day of the week is :"+dayofweek);

        }
        catch (Exception e){
            System.out.println("Invalid Date entered!");
        }
        sc.close();
    }
}
