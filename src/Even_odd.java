import java.util.Scanner;
public class Even_odd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int to_check = sc.nextInt();

        if(to_check%2 == 0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is Odd.");
        }
        sc.close();
    }
}
