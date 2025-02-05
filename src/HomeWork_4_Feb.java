import java.util.*;

public class HomeWork_4_Feb {
    Scanner sc = new Scanner(System.in);

    //Question1
    public void Sum(){
        Sum sum = (num1,num2) -> {
            return num1+num2;
        };

        System.out.println("Enter two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("The sum of the number is :"+sum.sum(a,b));
    }

//    Question2
    public void Emptyy(){

        Emptyy emp = (str) -> {
            if(str.length()==0){return true;}
            return false;
        };

        System.out.println("Enter String to check if empty");
        String s = sc.nextLine();
        System.out.println("Is the String empty? :"+emp.checkEmpty(s));
    }

//    Question3
    public void Case(){
        Case c = (strList) ->{
            List<String> result = new ArrayList<>();
            for(String s : strList){
                if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'){
                    result.add(s.toLowerCase());
                } else {
                    result.add(s.toUpperCase());
                }
            }
            return result;
        };
        List<String> list = new ArrayList<>();
        list.add("APPLE");
        list.add("banana");
        System.out.println("List before :"+list);
        System.out.println("List after :"+c.stringCase(list));
    }

//    Question4
    public void Even_Odd_Filter(){
        Even_Odd_Filter eof = (intList)->{
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for(int a:intList){
                if(a%2==0){
                    even.add(a);
                }
                else{odd.add(a);}
            }
            if(!even.isEmpty()){
                System.out.println("Even numbers of list :"+even);
            }
            if(!odd.isEmpty()){
                System.out.println("Odd numbers of list :"+odd);
            }
        };
        List<Integer> list = Arrays.asList(1,2,55,69,100,99,41,54);
        eof.Filter(list);
    }

    //Question5
    public void String_Sort(){
        String_Sort ss = (list)->{
            TreeSet<String> result = new TreeSet<>(list);
            return result;
        };
        List<String> list = new ArrayList<>();
        list.add("s");
        list.add("E");
        list.add("x");
        list.add("Y");
        list.add("b");
        list.add("0");
        list.add("y");
        System.out.println("Original List :"+list);
        System.out.println("After Sorting :"+ss.sortList(list));
    }

//    Question6
    public void Average_Double(){
        Average_Double ad = (list)->{
            double average=0;
            for(double a:list){
                average+=a;
            }
            return average/ list.size();
        };

        List<Double> list = new ArrayList<>();

        list.add(50.0);
        list.add(80.0);
        list.add(90.0);
        list.add(60.0);
        list.add(74.0);
        list.add(60.0);

        System.out.println("Given List :"+list);
        System.out.println("Average of the list :"+ad.avgDouble(list));
    }

//    Question7
    public void Factorial(){
        Factorial fact = (num)->{
          int factorial =1;
          for(int i=2;i<=num;i++){
              factorial*=i;
          }
          return factorial;
        };
        System.out.println("Enter the number to find Factorial of :");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is :"+fact.factorial(num));
    }

//    Question8
    public void Remove_Duplicates(){
        Remove_Duplicates rd = (list)->{
            Set<Integer> result = new TreeSet<>(list);
            return result;
        };
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(2);
        list.add(54);
        list.add(69);
        System.out.println("List with duplicate :"+list);
        System.out.println("After removing duplicate :"+rd.removeDuplicate(list));
    }

    //Question9
    public void Check_Prime(){
        Check_Prime cp = (a)->{
            if(a<2){return false;}
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){return false;}
            }
            return true;
        };

        System.out.println("Enter number to check if Prime no. :");
        int num = sc.nextInt();

        if(cp.isPrime(num)){
            System.out.println(num+" is a Prime number.");
        }
        else{
            System.out.println(num+" is not a Prime number.");
        }
    }

//    Question10
    public void Concat_Strings(){
        Concat_Strings cs = (str1,str2)->{
            return str1+" "+str2;
        };
        System.out.println("Enter First String :");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String :");
        String str2 = sc.nextLine();
        System.out.println("Concatenated String :"+cs.concatString(str1,str2));
    }

    //Question11
    public void MaxMin(){
        MaxMin mm = (list)->{


            int max=0;
            for(int a:list){
                if(a>max){max=a;}
            }

            int min = list.getFirst();
            for(int a:list){
                if(a<max){max=a;}
            }

            String result ="Max = "+max+" Min = "+min;
            return result;
        };
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println("Given List :"+list);
        System.out.println(mm.maxMin(list));
    }

//    Question12
    public void SumProduct(){
        SumProduct sp = (list)->{
            int sum=0,product=1;
            for (int a:list){
                sum+=a;
                product*=a;
            }
            String result = "Sum = "+sum+" Product = "+product;
            return result;
        };

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        System.out.println("Given List :"+list);
        System.out.println(sp.sumProduct(list));
    }

    //Question13
    public void Sentence(){
        Sentence sentence = (Str)->{
            int count=0;
            for(int i=0;i<Str.length();i++){
                if(Str.charAt(i)==' '){
                    count++;
                }
            }
            if (!Str.isEmpty()){count++;}
            return count;
        };
        System.out.println("Enter Sentence :");
        String sent = sc.nextLine();
        System.out.println("Number of words in the sentence is :"+sentence.countWords(sent));
    }

    //Question14
    public void PalindromeCheck(){
        PalindromeCheck pc = (Str) -> {
            StringBuilder reverse = new StringBuilder(Str);
            reverse.reverse();
            return Str.contentEquals(reverse);
        };
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        if(pc.checkPalindrome(str)){
            System.out.println(str+" is a Palindrome.");
        }
        else{
            System.out.println(str+" is not a Palindrome.");
        }
    }

//    Question15
    public void SquareSum(){
        SquareSum sss = (list)->{
            ArrayList<Double> evenSquare = new ArrayList<>();
            ArrayList<Double> oddSquare = new ArrayList<>();
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            double evenSum=0,oddSum=0;

            for(int a:list){
                if(a%2==0){
                    even.add(a);
                }
                else{odd.add(a);}
            }

            if(!even.isEmpty()){
                for(double a:even){
                    evenSquare.add(a*a);
                }
                for(double b:evenSquare){
                    evenSum += b;
                }
            }

            if(!odd.isEmpty()){
                for(double a:odd){
                    oddSquare.add(a*a);
                }
                for(double b:oddSquare){
                    oddSum += b;
                }
            }

            String result ="Even = "+evenSum+" Odd = "+oddSum;
            return result;
        };
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(2);
        list.add(54);
        list.add(69);
        System.out.println("Given List :"+list);
        System.out.println("The sum of squares of all odd and even numbers :"+sss.squareSum(list));
    }

//    Question16
    public void CheckWord(){
        CheckWord cw = (word,string)->{
            return string.contains(word);
        };
        System.out.println("Enter the String :");
        String string = sc.nextLine();
        System.out.println("Enter the word to search :");
        String word = sc.next();

        if(cw.isWordPresent(word,string)){
            System.out.println(string+" contains word "+word);
        }
        else{
            System.out.println(string+" does not contains word "+word);
        }
    }

//    Question17
    public void String_Length(){
        String_Length sl = (list)->{
            String max ="";
            for(String a:list){
                if(a.length()>max.length()){
                    max = a;
                }
            }
            String min = list.get(1);
            for(String b:list) {
                if(b.length()<min.length()){
                    if(b.length()<max.length()){
                        min = b;
                    }
                }
            }
            return "Max = "+max+", Min = "+min;
        };
        List<String> list = new ArrayList<>();
        list.add("vivek");
        list.add("saurabh");
        list.add("piya");
        System.out.println("Given String List :"+list);
        System.out.println(sl.stringLength(list));
    }

    //Question18
    public void PerfectSquare(){
        PerfectSquare ps = (n)->{
          return Math.sqrt(n);
        };
        System.out.println("Enter the number to check if Perfect square :");
        int num = sc.nextInt();

        if(ps.perfectSquare(num)){
            System.out.println(num+" is a perfect square.");
        }
        else{
            System.out.println(num+" is not a perfect square.");
        }
    }
    public static void main(String[]args){
        HomeWork_4_Feb obj = new HomeWork_4_Feb();
//        obj.Sum();
//        obj.Emptyy();
//        obj.Case();
//        obj.Even_Odd_Filter();
//        obj.String_Sort();
//        obj.Average_Double();
//        obj.Remove_Duplicates();
//        obj.Factorial();
//        obj.Check_Prime();
//        obj.Concat_Strings();
//        obj.MaxMin();
//        obj.SumProduct();
//        obj.Sentence();
//        obj.PalindromeCheck();
//        obj.SquareSum();
//        obj.CheckWord();
//        obj.CheckWord();
//        obj.String_Length();
        obj.PerfectSquare();
    }

}

//1. Write a Java program to implement a lambda expression to find the sum of two integers.
interface Sum{
    public int sum(int a,int b);
}

//2. Write a Java program to implement a lambda expression to check if a given string is empty.
interface Emptyy{
    public boolean checkEmpty(String str);
}

//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
interface Case{
    public List<String> stringCase(List<String> list);
}

//4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
interface Even_Odd_Filter{
    public void Filter(List<Integer> list);
}

//5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
interface String_Sort{
    public TreeSet<String> sortList(List<String> list);
}

//6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
interface Average_Double{
    public double avgDouble(List<Double> list);
}

//7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
interface Remove_Duplicates{
    public Set<Integer> removeDuplicate(List<Integer> list);
}

//8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
interface Factorial{
    public int factorial(int a);
}

//9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
interface Check_Prime{
    public boolean isPrime(int a);
}

//10. Write a Java program to implement a lambda expression to concatenate two strings.
interface Concat_Strings{
    public String concatString(String a,String b);
}

//11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
interface MaxMin{
    public String maxMin(List<Integer> list);
}

//12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
interface SumProduct{
    public String sumProduct(List<Integer> list);
}

//13. Write a Java program to implement a lambda expression to count words in a sentence.
interface Sentence{
    public int countWords(String sentence);
}

//14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
interface PalindromeCheck{
    public boolean checkPalindrome(String str);
}

//15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
interface SquareSum{
    public String squareSum(List<Integer> list);
}
//16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
interface CheckWord{
    public boolean isWordPresent(String word,String string);
}
//17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
interface String_Length{
    public String stringLength(List<String> list);
}
//18. Write a Java program to implement a lambda expression to check if a given number is a perfect square.
interface PerfectSquare{
    public boolean perfectSquare(int num);
}
//19. Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
//
//
//20. Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
//
//
//21. Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.
//
//
//22. Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
//
//
//23. Write a Java program to implement a lambda expression to find the average length of strings in a list.
//
//
//24. Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
//
//
//25. Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.