import java.util.Scanner;
public class Misc {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Line");
//        String str = sc.nextLine();
//
//
//       String new_str = str.replace(" ","$");
//
//        System.out.println("New Line :"+new_str);
//    }

//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        int[]a = {12,34,21,11,13};
//        int grt=0,sml=0;
//        System.out.println("Number Smaller than 20.");
//        for(int i=0;i<a.length;i++){
//            if(a[i]<=20){
//                System.out.print(a[i]+" ");
//                sml++;
//            }
//
//            }
//        System.out.println("\ngreater than 20.");
//        for(int i=0;i<a.length;i++){
//            if(a[i]>20){
//                System.out.print(a[i]+" ");
//                grt++;
//            }
//
//        }
//        }

//            public static void main(String[] args) {
//                int[] b = {12, 34, 21, 11, 13};
//
//
//                int sum = 0;
//                int count = 0;
//
//
//                for (int num : b) {
//
//                    if (String.valueOf(num).contains("2")) {
//                        sum += num;
//                        count++;
//                    }
//                }
//
//
//                if (count > 0) {
//                    double average = (double) sum / count;
//                    System.out.println("Average of numbers containing the digit 2: " + average);
//                } else {
//                    System.out.println("No numbers containing the digit 2 found.");
//                }
//            }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int marks = 0;

        try{
            System.out.println("Enter the marks :");
            marks = sc.nextInt();
            if(marks >=75&&marks<=100){
                System.out.println("Grade A");
            }
            else if (marks>=40 && marks<=74) {
                System.out.println("Grade B");
            }
            else {throw new Exception("Invalid Grade ! Please Try Again");}

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {

        }
    }

}





