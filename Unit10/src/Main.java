//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student leery = new Student("Leery", 22, "225468122", "Adv. Dip IT");
    leery.displayDetails();
    Lecture sam = new Lecture("Sammy", 33, "K5456", "IT");
    sam.displayDetails();
    Cat cat=new Cat();
    Dog dog=new Dog();
    Cow cow = new Cow();
    Animal[] animals = {cat, dog, cow};
    for (Animal animal : animals) {
        animal.makeSound();
    }
    Shape[] shapes = {new Rectangle(2.66, 9.5), new Radius(8.4)};
    for(Shape shape:shapes){
        print(Double.toString(
                shape.calculateArea()));
    }
    Employee[] employees = {new FullTimeEmployee(8456.66, "Beth", "B546"), new PartTimeEmployee(90, 200, "carlos", "LK56")};
    for(Employee emp:employees){
        print(String.format("=======================\nName: %s\tEmployee Number: %s\nSalary: %.2f\n=========================",emp.name,emp.employeeNumber,emp.calculateSalary()));
    }
}

public class Person{
    private final String name;
    private final int age;
    public Person(){
        name = "No name";
        age=0;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        print(String.format("Name: %s\nAge: %s", name, age));
    }
}
public class Student extends Person{
    String studentNumber,course;
    public Student(String name, int age, String studentNumber, String course) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.course = course;
    }
    public Student(){
        super();
        studentNumber = "N/A";
        course = "N/A";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        print(String.format("Student Number: %s\nCourse: %s", studentNumber, course));
    }
}



public class Lecture extends Person{
    private String employeeNumber, department;
    public Lecture(){
        super();
        employeeNumber = "-";
        department = "IT";
    }

    public Lecture(String name,int age,String employeeNumber, String department) {
        super(name,age);
        this.employeeNumber = employeeNumber;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        print(String.format("Employee number: %s\nDepartment: %s", employeeNumber, department));
    }
}

public class Animal{
    public void makeSound(){print("Animal make sound.");}
}

public class Cat extends Animal{
    @Override
    public void makeSound() {
        print("Cat meows");
    }
}

public class Dog extends Animal{
    @Override
    public void makeSound() {
        print("Dog barks");
    }
}

public class Cow extends Animal{
    @Override
    public void makeSound() {
        print("Cow moos");
    }
}

public abstract class Shape{
    public abstract double calculateArea();
    public void displayMessage(){
        print("Calculating shape area...");
    }
}

public class Radius extends Shape{
    private double radius=0;

    public Radius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Rectangle extends Shape{
    private double length=0, width=0;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

public abstract class Employee {
    private String employeeNumber = "",name="";
    public Employee(String name,String employeeNumber) {
        this.employeeNumber = employeeNumber;
        this.name=name;
    }
    public abstract double calculateSalary();
}

public class FullTimeEmployee extends Employee{
    private final double monthlySalary;
    public FullTimeEmployee(double monthlySalary,String name,String employeeNumber){
        super(name,employeeNumber);
        this.monthlySalary = monthlySalary;}

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

public class PartTimeEmployee extends Employee {
    private final int hoursWorked;
    private final double hourlyRate;
    public PartTimeEmployee(int hoursWorked,
    double hourlyRate,String name,String employeeNumber){
        super(name,employeeNumber);
    this.hourlyRate=hourlyRate;
    this.hoursWorked=hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public static void print(String content){
    System.out.println(content);
}