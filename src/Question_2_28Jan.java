import java.util.*;
public class Question_2_28Jan {

//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("\nEnter title :");
//        String title = sc.next();
//        System.out.println("Enter author :");
//        String author = sc.next();
//        System.out.println("Enter price :");
//        double price = sc.nextDouble();
//
//        Book b1 = new Book();
//        System.out.println("Default constructor values :");
//        System.out.println("Title :"+b1.getTitle());
//        System.out.println("Author :"+b1.getAuthor());
//        System.out.println("Price :"+b1.getPrice());
//
//        Book b2 = new Book(title,author,price);
//        System.out.println("Parameterized constructor values :");
//        System.out.println("Title :"+b2.getTitle());
//        System.out.println("Author :"+b2.getAuthor());
//        System.out.println("Price :"+b2.getPrice());
//
//        sc.close();
//    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Employee name:");
        String name = sc.next();
        System.out.println("Enter the Employee age:");
        int age = sc.nextInt();
        System.out.println("Enter the Employee salary:");
        double salary = sc.nextDouble();

        Employee e = new Employee();
        e.setName(name);
        e.setAge(age);
        e.setSalary(salary);

        System.out.println("The Employee name is :"+e.getName());
        System.out.println("The Employee age is :"+e.getAge());
        System.out.println("The Employee salary is :"+e.getSalary());
    }
}

//Scenario: You are tasked with creating a class Book with attributes such as title, author, and price.
// You need to create two objects: one with default values and another with custom values.
//
//Write a code:
//How will you initialize these objects?
//How can you make sure the default constructor initializes the price as 0.0, and the custom constructor takes all three parameters?
class Book1 {
    String title, author;
    double price;

    Book1() {
        title = "Mind your_own Buisness";
        author = "Vivek";
        price = 690.69;
    }

    Book1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
    //Scenario: You are working on an application that manages employee information.
    // You need a Employee class with name, age, and salary as private attributes. You should provide public methods to access and modify these attributes while keeping them secure.
    //Implementation:
    //
    //How would you implement getter and setter methods for salary and ensure that no one can set a negative salary?
    class Employee{
        private String name;
        private int age;
        private double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }
