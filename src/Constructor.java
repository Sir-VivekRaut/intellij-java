

class C {
	
	private int a =20;
	private int b = 50;
	
	C() {
		System.out.println("This is a default constructor.");
	} //constructor
	
	C(int a,int b){                //Parameterized Constructor
		this.a =a;
		this.b=b;
		int c = a+b;
		System.out.println("\nAddition by Parameterized Constructor is :"+c);
	}
	
	 C(C c1){                     //Copy Constructor
		 this.a=c1.a;
		 this.b=c1.b;
		System.out.println("\nIN Copy Constructor\n a="+a);
		System.out.println(" b="+b);
	}

	}


public class Constructor{
	
	public static void main(String []args) {
		C c = new C();
		C c1 = new C(3,6);
		C c2 = new C(c1);
}}