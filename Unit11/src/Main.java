void main() {
    Student student = new Student();
    student.login();
    student.logout();
    Employee emp = new Employee();
    emp.performWork();
    emp.receiveSalary();
}
interface Authenticate {
    void login();
    void logout();
}

class Student implements Authenticate, Person {
    @Override
    public void displayDetails() {
        print("Hello from Student class");
    }
    public void registerCourse(){
        print("registering....");
    }
    @Override
    public void login() {
        print("Login....");
    }

    @Override
    public void logout() {
        print("Logout....");
    }
}

class UniversityStudent extends Student{

}

static void print(String content){
 System.out.println(content);
}

interface Workable{
    void performWork();
}
interface Payable{
    void receiveSalary();
}

class Employee implements Payable,Workable{
    @Override
    public void performWork() {
        print("123");
    }

    @Override
    public void receiveSalary() {
        print("456");
    }
}

interface Person{
    void displayDetails();
}

interface Notification{
    void sendNotification();
    default void displayMessage(){
        print("Loading message...");
    }
}

class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        print("Email sent....");
    }
}
class SMSNotification implements Notification{
    @Override
    public void sendNotification() {
        print("SMS sent....");
    }
}

abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}
interface Movable{
    void Move();
}

class Dog extends Animal implements Movable {
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound() {
        print(name+" Says Woff woff");
    }

    @Override
    public void Move() {
        print("Running....");
    }
}

class University{
    final String UNIVERSITY_NAME = "Central University of Technology";
    final void displayUniversityName(){
        print(UNIVERSITY_NAME);
    }
}
class Student1 extends University{
//    @override
//    public void displayUniversityName() {
//
//        print(UNIVERSITY_NAME);
//    }
}