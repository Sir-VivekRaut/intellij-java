
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,n4;
		
		System.out.println("Enter the first no :");
		n1 = sc.nextInt();
		
		System.out.println("Enter the Second no :");;
		n2 = sc.nextInt();
		
		n3 = n1 + n2;
		System.out.println("The Addition of the nos. is :"+n3);
		
		n4 = n1- n2;
		System.out.println("The Substraction of two nos. is :"+n4);
		
		sc.close();
		

	}

}

