//5 functions of arraylist, linkedlist, hashset, treeset
//Add, remove, check whether a particular method exist, find the index of value

import java.util.*;
public class Collection_30Jan {
    public static void main(String[]args){
        List al = new ArrayList();
        al.add(55);
        al.add("Vivek");
        al.add(true);
        al.add(69.254);
        al.add(55);
        System.out.println("ArrayList elements :"+al);
        System.out.println("Index of vivek :"+al.indexOf("Vivek"));
        System.out.println("Does 55 exist :"+al.contains(55));
        al.remove(0);
        System.out.println("After removing 55 :"+al);

        List ll = new LinkedList();
        ll.add(61);
        ll.add("Raut");
        ll.add(false);
        ll.add(55.0069);
        ll.add(55);
        System.out.println("\n\nLinkedList Elements :"+ll);
        System.out.println(ll.indexOf("Raut"));
        System.out.println("Does 55 exist :"+ll.contains(55));
        ll.remove(2);
        System.out.println("After removing boolean"+al);

        Set hs = new HashSet<>();
        hs.add(55);
        hs.add("Vivek");
        hs.add(true);
        hs.add(55.0069);
        hs.add(55);
        System.out.println("\n\nHashSet Elements :"+hs);
        System.out.println("Is hash set empty? :"+hs.isEmpty());
        System.out.println("Does 55 exist :"+hs.contains(55));
        hs.remove(1);
        System.out.println("After removing String"+al);

        Set ts = new TreeSet();
        ts.add(55);
        ts.add(61);
        ts.add(100);
        ts.add(55);
        ts.add(69);
        System.out.println("\n\nTreeSet Elements :"+ts);
        System.out.println("Is tree set empty? :"+ts.isEmpty());
        System.out.println("Does 55 exist :"+ts.contains(55));
        ts.remove(3);
        System.out.println("After removing double"+ts);

        Map<Integer,String> map = new HashMap<>();
        map.put(34,"saurabh");
        map.put(55,"Vivek");
        map.put(54,"vishal");
        map.put(61,"yash");
        System.out.println("\n\nMap elements :"+map);
        System.out.println("Is Map empty? :"+map.isEmpty());
        System.out.println(" 3rd element in the Map :"+map.get(3));
        System.out.println("Replace Vivek with vivek "+map.replace(1,"vivek"));
        map.remove(0);
        System.out.println("Remove first element :"+map);


    }
}
