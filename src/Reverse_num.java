import java.util.Scanner;
public class Reverse_num {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int no = num;
        int rev = 0;

        while (no != 0){
            rev = rev*10 + no%10;
            no /= 10;
        }

        System.out.println("The reverse of "+num+" is "+rev);
    }
}
