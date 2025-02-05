import java.util.Scanner;

//Create a Person class:
//Define a class Person with the following attributes: name (String), age (int), and address (String).
//Create getter and setter methods for each attribute.
//In the main method, create an object of the Person class and set its attributes using setters. Then, print the values using getters.
//Example Output:
//Name: John Doe
//Age: 30
//Address: 123 Main St.
class Person{
    String name;
    int age;
    String address;

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

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }
}
//2. Create a Book class:
//Define a class Book with attributes title (String), author (String), and price (double).
//Include getters and setters for all attributes.
//Write a method applyDiscount(double discount) that reduces the price of the book by a given percentage.
//In the main method, create a Book object, set the values using setters, apply a discount, and print the details.
//Example Output:
//Title: Java Programming
//Author: Jane Smith
//Price: 50.0
//Price after 10% discount: 45.0
//
class Book{
    String title;
    String author;
    double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
//3. Create a Rectangle class:
//Define a class Rectangle with attributes length (double) and width (double).
//Include getters and setters for both attributes.
//Add a method calculateArea() that calculates and returns the area of the rectangle (length * width).
//Add another method calculatePerimeter() that calculates and returns the perimeter (2 * (length + width)).
//In the main method, create a Rectangle object, set the length and width, and print the area and perimeter.
//Example Output:
//Area: 20.0
//Perimeter: 18.0
//
class Rectangle{
    double length;
    double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(double length,double width){

        return length*width;
    }
    public double calculatePerimeter(double length,double width){

        return 2*(length+width);
    }
}
//4. Create a BankAccount class:
//Define a BankAccount class with attributes accountNumber (String), accountHolder (String), and balance (double).
//Create getter and setter methods for each attribute.
//Add a method deposit(double amount) to add money to the balance.
//Add a method withdraw(double amount) to subtract money from the balance.
//In the main method, create a BankAccount object, set its initial values using setters, and perform some deposits and withdrawals. Print the balance after each transaction.
//
//Example Output:
//Initial balance: 1000.0
//After deposit: 1500.0
//After withdrawal: 1200.0
//
class BankAccount{
    String accountNumber;
    String accountHolder;
    double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
}
//5. Create a Car class:
//Define a class Car with attributes make (String), model (String), year (int), and mileage (double).
//Include getters and setters for all attributes.
//Add a method drive(double distance) that increases the mileage of the car by the given distance.
//In the main method, create a Car object, set its attributes, and drive the car by a specific distance. Then, print the updated mileage.
//Example Output:
//Make: Toyota
//Model: Corolla
//Year: 2020
//Mileage: 10000.0
//Mileage after driving 100 miles: 10100.0

class Car{
    String make;
    String model;
    int year;
    double mileage;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double drive(double distance){

        return mileage+distance;
    }
}
public class HomeWork_29Jan {
//    1.Create a Person class:
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        Person p = new Person();
//
//        System.out.println("Enter Name :");
//        String name = sc.nextLine();
//        System.out.println("Enter Age :");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter Address :");
//        String address = sc.nextLine();;
//
//        p.setName(name);
//        p.setAge(age);;
//        p.setAddress(address);
//
//        System.out.println("Name "+p.getName());
//        System.out.println("Age :"+p.getAge());
//        System.out.println("Address :"+p.getAddress());
//    }


//2. Create a Book class:
//public static void main(String[]args){
//    Scanner sc = new Scanner(System.in);
//
//    Book b = new Book();
//
//    System.out.println("Enter Title :");
//    String title = sc.nextLine();
//    System.out.println("Enter Author :");
//    String author = sc.nextLine();
//    System.out.println("Enter Price :");
//    double price = sc.nextDouble();;
//
//    b.setTitle(title);
//    b.setAuthor(author);
//    b.setPrice(price);
//
//    System.out.println("Title:"+b.getTitle());
//    System.out.println("Author: "+b.getAuthor());
//    System.out.println("Price:"+b.getPrice());
//    double discount = (b.getPrice()-(b.getPrice()*0.1));
//    System.out.println("Price after 10% discount:"+discount);
//}

    //3. Create a Rectangle class:
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        Rectangle r = new Rectangle();
//
//        System.out.println("Enter length of rectangle:");
//        double length = sc.nextDouble();
//        System.out.println("Enter width of rectangle:");
//        double width = sc.nextDouble();
//
//        System.out.println("Area:"+r.calculateArea(length,width));
//        System.out.println("Perimeter:"+r.calculatePerimeter(length,width));
//    }

//4. Create a BankAccount class:
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//
//        BankAccount ba = new BankAccount();
//
//        System.out.println("Enter Account holder name:");
//        String name = sc.nextLine();
//        System.out.println("Enter Account number:");
//        String accountNumber = sc.next();
//        System.out.println("Enter Initial amount:");
//        double balance = sc.nextDouble();
//
//        ba.setAccountNumber(name);
//        ba.setAccountNumber(accountNumber);
//        ba.setBalance(balance);
//
//        System.out.println("Account holder name:"+ba.getAccountHolder());
//        System.out.println("Account number:"+ba.getAccountNumber());
//        System.out.println("Initial Balance:"+ba.getBalance());
//        int flag = 0;
//        double amount=0;
//        while(flag==0){
//
//            System.out.println("What do you want to do?\n1.Deposit\n2.Withdraw\n3.Cancel op");
//            int op = sc.nextInt();
//            switch (op){
//                case 1:
//                    System.out.println("ENTER AMOUNT TO DEPOSIT:");
//                    amount = sc.nextDouble();
//                    ba.deposit(amount);
//                    System.out.println("After deposit:"+ba.getBalance());
//                    break;
//
//                case 2:
//                    System.out.println("ENTER AMOUNT TO WITHDRAW:");
//                    amount = sc.nextDouble();
//                    ba.withdraw(amount);
//                    System.out.println("After withdraw:"+ba.getBalance());
//                    break;
//
//                case 3:
//                    flag = 1;
//
//                default:
//                    System.out.println("Invalid option!");
//                    break;
//            }
//        }
//    }

    //5. Create a Car class:
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        Car c = new Car();
//
//        System.out.println("Enter maker:");
//        String make = sc.nextLine();
//        System.out.println("Enter model:");
//        String model = sc.nextLine();
//        System.out.println("Enter year:");
//        int year = sc.nextInt();
//        System.out.println("Enter mileage:");
//        double mileage = sc.nextDouble();
//        System.out.println("Distance travelled:");
//        double distance = sc.nextDouble();
//
//        c.setMake(make);
//        c.setModel(model);
//        c.setYear(year);
//        c.setMileage(mileage);
//
//        System.out.println("Mileage after driving "+distance+" miles: "+c.drive(distance));
//    }
}