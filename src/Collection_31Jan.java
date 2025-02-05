import java.util.*;

public class Collection_31Jan {
    //Write a Java program to add elements to an ArrayList, sort them, and print the sorted list.

    public  static void main(String[]args){
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(16);
//        arr.add(14);
//        arr.add(18);
//        arr.add(54);
//        arr.add(61);
//        arr.add(55);
//        arr.add(14);
//
//        System.out.println("ArrayList elements :"+arr);
//
//        Collections.sort(arr);
//        System.out.println("Sorted ArrayList :"+arr);
//
//        System.out.println("Number of times 14 occurred :"+Collections.frequency(arr,14));
//
//        TreeSet<Integer> ts = new TreeSet<>(arr);
//        arr = new ArrayList<>(ts);
//        System.out.println("removing duplicate elements :"+arr);
//
//        System.out.println("\nTraversing the arrayList :");
//        for(int i=0;i<arr.size();i++){
//            System.out.println(arr.get(i));
//        }
        String str = "Helloo";

        ArrayList<Character> arr1 = new ArrayList<>();
        arr1.add(str.charAt(0));
        arr1.add(str.charAt(1));
        arr1.add(str.charAt(2));
        arr1.add(str.charAt(3));
        arr1.add(str.charAt(4));
        arr1.add(str.charAt(5));

        System.out.println("\n\nArrayList containing letters of word "+str+" :"+arr1);

        Map<Character,Integer> map = new HashMap<>();
        map.put((Character) arr1.get(0),Collections.frequency(arr1,arr1.get(0)));
        map.put((Character) arr1.get(1),Collections.frequency(arr1,arr1.get(1)));
        map.put((Character) arr1.get(2),Collections.frequency(arr1,arr1.get(2)));
        map.put((Character) arr1.get(3),Collections.frequency(arr1,arr1.get(3)));
        map.put((Character) arr1.get(4),Collections.frequency(arr1,arr1.get(4)));

        System.out.println(map);

    }
}
