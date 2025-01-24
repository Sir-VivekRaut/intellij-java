import java.util.Scanner;
public class IsPrime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        Boolean isPrime = true;

        if(num <=1){
            isPrime=false;
        }
        else{
            for (int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("The number is a Prime number.");
        }
        else{
            System.out.println("The number is not a Prime number.");
        }
    }
}
