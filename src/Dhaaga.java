
import java.lang.Thread;

class Many extends Thread{
	public void run() {
		System.out.println("Current Run() of Thread:"+Thread.currentThread().getName()+"\n");
	}
}

class SoMany implements Runnable{
	public void run() {

		System.out.println("Current Run() of Thread:"+Thread.currentThread().getName()+"\n");
	}
}

public class Dhaaga {

	public static void main(String[] args) {
		System.out.println("By extending Thread Class.\n");
		System.out.println("Current ThreadName:"+Thread.currentThread().getName()+"\n");
		
		String first = "First" , second = "Second" , third = "Third" , fourth="Fourth" , fifth="Fifth" , sixth="Sixth";
		
		Many m1 =new Many();
		Many m2 =new Many();
		Many m3 =new Many();
		
		m1.start();
		System.out.println("Current ThreadName:"+m1.getName());
		m1.setName(first);
		System.out.println("New ThreadName:"+m1.getName());		
		try {
			Thread.sleep(1500);
			m1.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread not Working!");
		}

		m2.start();
		System.out.println("Current ThreadName:"+m2.getName());
		m2.setName(second);
		System.out.println("New ThreadName:"+m2.getName());		
		try {
			Thread.sleep(1500);
			m2.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread not Working!");
		}

		m3.start();
		System.out.println("Current ThreadName:"+m3.getName());
		m3.setName(third);
		System.out.println("New ThreadName:"+m3.getName());

		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException e) {}

		System.out.println("\nBy implementing Runnable interface.\n");
		
		
		SoMany s1 =new SoMany();
		SoMany s2 =new SoMany();
		SoMany s3 =new SoMany();
		
		Thread st1 = new Thread(s1);
		st1.setPriority(1);
		Thread st2 = new Thread(s2);
		st2.setPriority(2);
		Thread st3 = new Thread(s3);
		st3.setPriority(3);

		System.out.println("Is Thread:"+st1.getName()+"Alive? :"+st1.isAlive());
		st1.start();
		System.out.println("Current ThreadName:"+st1.getName());
		System.out.println("Priority of "+st1.getName()+" is :"+st1.getPriority());
		st1.setName(fourth);
		System.out.println("New ThreadName:"+st1.getName());
		System.out.println("Is Thread:"+st1.getName()+"Alive? :"+st1.isAlive());		
		try {
			Thread.sleep(1500);
			st1.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread not Working!");
		}

		System.out.println("Is Thread:"+st2.getName()+"Alive? :"+st2.isAlive());
		st2.start();
		System.out.println("Current ThreadName:"+st2.getName());
		System.out.println("Priority of "+st2.getName()+" is :"+st2.getPriority());
		st2.setName(fifth);
		System.out.println("New ThreadName:"+st2.getName());
		System.out.println("Is Thread:"+st2.getName()+"Alive? :"+st2.isAlive());
		
		try {
			Thread.sleep(1500);
			st2.join();
		}
		catch(InterruptedException e) {
			System.out.println("Thread not Working!");
		}

		System.out.println("Is Thread:"+st3.getName()+"Alive? :"+st3.isAlive());
		st3.start();
		System.out.println("Current ThreadName:"+st3.getName());
		System.out.println("Priority of "+st3.getName()+" is :"+st3.getPriority());
		st3.setName(sixth);
		System.out.println("New ThreadName:"+st3.getName());
		System.out.println("Is Thread:"+st3.getName()+"Alive? :"+st3.isAlive());
	}
}
