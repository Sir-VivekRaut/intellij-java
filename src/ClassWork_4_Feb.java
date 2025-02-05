import java.util.Arrays;
import java.util.*;

public class ClassWork_4_Feb {
    public static void main(String[] args) {
        Demoo d = (a, b) -> {

            return "Lambda :"+a + " " + b;
        };
        System.out.println(d.add("Vivek", "Raut"));

        Chill c = new Chill();
        System.out.print("Default :");
        c.vivek();
    }
}
    interface Demoo {
        public String add(String a, String b);

        default void vivek(){
            System.out.println("My name is Vivek");
        }
    }


class Chill implements Demoo{
    public String add(String a,String b){
        return a+" "+b;
    }
}
