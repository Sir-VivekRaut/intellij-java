

class SuperClass{
	int a = 55;
	int b = 54;
	
	SuperClass(){
		System.out.println("This is Super Class.");
		System.out.println("This is a method of Super Class.");
	}
}

class DerivedClass extends SuperClass{
	int a= 65;
	int b= 64;
	DerivedClass(){
		super();
		System.out.println("a = "+super.a);
		System.out.println("b = "+super.b);
		
		System.out.println("\n\nThis is Derived Class.");
		System.out.println("This is a method of Derived Class.");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

public class Super {

	public static void main(String[] args) {
		DerivedClass d = new DerivedClass();
	}

}
