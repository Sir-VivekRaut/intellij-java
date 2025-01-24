import java.util.Scanner;
public class String_reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse :");
        String original = sc.nextLine();
        String reverse = "";
        for(int i=0;i<=original.length()-1;i++){
            char re = original.charAt(i);
            reverse = re + reverse;
        }
        System.out.println("The reverse of "+original+" is "+reverse);
        sc.close();
    }
}
