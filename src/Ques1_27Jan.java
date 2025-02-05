import java.util.Arrays;

public class Ques1_27Jan {
    //average of all values in an array

    public static void main(String args[]){
        Ques1_27Jan q = new Ques1_27Jan();
    }
   public  static  void Average(String[]args){
       int[] arr = {12,34,56,74,32};

       int sum =0;
       for(int i=0;i< arr.length;i++){
           sum += arr[i];
       }

       System.out.println("Average :"+(sum/ arr.length));
   }

    //even numbers

    public void Even(String[]args){
        int arr[] = {12,31,65,73,32};
        int[] even = new int[5];
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[index] = arr[i];
                index++;
            }
        }
        System.out.println("Even numbers in the array:");
        for(int i=0;i< even.length;i++){
            if(even[i]>0){
            System.out.println(even[i]);}
        }
    }

    //total numbers
    public void elements(String[]args){
        int[] arr1 = {12,31,65,73,32};
        System.out.println("No. of elements in array :"+arr1.length);
    }

    //starting with 3
    public void three(){
        int[] arr2 = {12,31,65,73,32};
        int[] three = new int[5];
        int index =0;

        for(int i=0;i< arr2.length;i++){
            int digit = arr2[i];
            int unit = digit%10;
            digit /= 10;
            int tens = digit%10;

            if(unit==3||tens==3){
                three[index] = arr2[i];
                index++;
            }
        }
        System.out.println("Number with 3");
        for (int i=0;i< three.length;i++){
            if(three[i]>0){
            System.out.println(three[i]);}
        }
    }

    //duplicate numbers

    public void duplicate(){
        int[] arr3 = {12,31,65,73,32,12};
        int[] dupli = new int[5];
        int index = 0;

        for (int i=0;i<arr3.length;i++){
            for(int j =i;j< arr3.length;j++){
                if(arr3[i]==arr3[j]){
                    dupli[index] = arr3[j];
                }
            }
        }
        System.out.println("Duplicate numbers are");
        for(int i=0;i< dupli.length;i++){
            if(dupli[i]>0){
                System.out.println(dupli[i]);
            }
        }
    }

    //Maximun and minimum value
    public void max_min(){
        int[] arr4={12,31,65,73,32};
        int[] arr = Arrays.stream(arr4).sorted().toArray();
        System.out.println("Maximum element :"+arr[(arr.length)-1]);
        System.out.println("Minimum element :"+arr[0]);
    }


}
