import java.util.Collections;
import java.util.LinkedList;

public class ClassWork_3Feb {
//    public static void main(String[]args){
//        Carr car = new Carr();
//        car.start();
//        car.numOfWheel();
//
//
//        Bike bike = new Bike();
//        bike.start();
//        bike.numOfWheel();
//    }

//    public static void main(String[]args){
//        String name = null;
//
//        try{
//            int lenght = name.length();
//            System.out.println("Length of "+name+" is "+lenght);
//        }
//        catch (NullPointerException e){
//            System.out.println("error : Method implemented on a null object!");
//        }
//        System.out.println("Program continues to execute from here.");
//    }

    public static void main(String[]args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original List :"+list);
//        Collections.reverse(list);
        for (int k = 0, j = list.size() - 1; k < j; k++)
        {
            list.add(k, list.remove(j));
        }



        System.out.println("Reversed List :"+list);
    }
}

class Vehicle{
    final String fuel = "Petrol";
    public void start(){
        System.out.println("Vehicle is starting...");
    }
    public final void fuel(){
        System.out.println("Fuel type :"+fuel);
    }
}

interface Wheel{
    public  void numOfWheel();
}

class Carr extends Vehicle implements Wheel{
    public Carr(){
        super.fuel();
    }
    @Override
    public void start() {
        super.start();
        System.out.println("Car is starting with key.");
    }
    @Override
    public void numOfWheel() {
        System.out.println("Car has 4 wheels.\n");
    }
}

class Bike extends Vehicle implements Wheel{
    public Bike(){
        super.fuel();
    }
    @Override
    public void start() {
        super.start();
        System.out.println("Bike starting with kick.");
    }

    @Override
    public void numOfWheel() {
        System.out.println("Bike has 2 wheels.");
    }
}

