import java.util.Scanner;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check :");
        String check = sc.nextLine();
        String reverse = "";

        for(int i =0;i<=check.length()-1;i++){
            reverse = check.charAt(i) + reverse;
        }
        System.out.println("The reverse of the string is :"+reverse);
        if(check.equals(reverse)){
            System.out.println("The given String is a palindrome");
        }
        else{
            System.out.println("The given String is not a palindrome");
        }
        sc.close();
    }
}
