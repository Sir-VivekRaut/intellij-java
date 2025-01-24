import java.util.Scanner;
public class Area {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side :");
        int sides = sc.nextInt();
        Float side1,side2;

        switch (sides){
            case 0:
                System.out.println("Enter the radius :");
                side1 = sc.nextFloat();
                System.out.println(STR."The area of circle is \{3.14 * side1 * side1}");
                break;

            case 3:
                System.out.println("Enter the base :");
                side1 = sc.nextFloat();
                System.out.println("Enter the height :");
                side2 = sc.nextFloat();
                System.out.println(STR."The area of triangle is \{0.5 * side1 * side2}");

            case 4:
                System.out.println("Enter the length :");
                side1 = sc.nextFloat();
                System.out.println("Enter the breadth :");
                side2 = sc.nextFloat();
                if(side1.equals(side2)){
                    System.out.println(STR."The area of square is \{side1 * side2}");
                }
                else{
                    System.out.println(STR."The area of rectangle is \{side1*side2}");
                }

            default:
                System.out.println("Invalid side");
        }
    }
}
