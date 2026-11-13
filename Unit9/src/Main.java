//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Student student=new Student("Rethabile","Adv. Dip IT",22);
    student.displayDetails();
    Employee emp1 = new Employee();
    emp1.displayDetails();
    Employee emp2 = new Employee("Eric","J545",15548.66);
    emp2.displayDetails();
    Employee emp3 = new Employee("Siase","KH5554");
    emp3.displayDetails();
    var product=new Product();
    product.setName("Coke");
    product.setQuantity(8);
    product.setSalary(86.86);
    print(product.getName());
    print(Double.toString(product.getPrice()));
    print(Integer.toString(product.getQuantity()));
    Person person=new Person();
    person.setAge(22);
    print("Age: " + person.getAge());
    person.setAge(149);
    print("Age: " + person.getAge());
    BankAccount account = new BankAccount("Danny", "H545", 6251);
    account.displayDetails();
    account.withdraw(800);
    account.deposit(9000);
    account.displayDetails();
}

public class Student{
    private final String name;
    private final String course;
    private final int age;
    public Student(){
        name = "UNKNOWN";
        course = "NOT SPECIFIED";
        age = 0;
    }
    public Student(String name,String course,int age){
        this.name = name;
        this.course = course;
        this.age = age;
    }
    public void displayDetails(){
        print("Name: " + name);
        print("Course: " + course);
        print("Age: " + age);
    }
}
public class Employee{
    private String name;
    private String employeeNumber;
    private double salary;

    public Employee(String name, String employeeNumber, double salary) {

        this.name = name;
        this.employeeNumber = employeeNumber;
        this.salary = salary;
    }
    public Employee(){
        name="Unknown";
        employeeNumber="5DD5642133";
        salary = 0;
    }
    public Employee(String name, String employeeNumber) {

        this.name = name;
        this.employeeNumber = employeeNumber;
        salary = 0;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setEmployeeNumber(String newEmployeeNumber) {
        employeeNumber = newEmployeeNumber;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
        }
        print("New Salary must be greater than 0");
    }
    public String getName(){
        return name;}
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    public double getSalary(){
        return salary;
    }
    public double calculateAnnualSalary(){
        return salary * 12;
    }
    public void displayDetails(){
        print("Name: " + name);
        print("Employee Number: " + employeeNumber);
        print(String.format("Salary: R%.2f", salary));
    }
}

public class Product{
    private String name;
    private int quantity;
    private double price;
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

public class Person{
    private int age;
    public void setAge(int newAge){
        if(newAge>0&&newAge<121){
            this.age=newAge;
        }
    }
    public int getAge(){
        return age;}
}

public class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder,
                       String accountNumber,
                       double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(double amount){
        if(amount>0){
            print("Success!");
            return balance+=amount;
        }
        print("Deposit amount must be a positive value.");
        return balance;
    }
    public double withdraw(double amount){
        if(amount>0&amount<=balance){
            print("Success!");
            return balance-=amount;
        }
        print("Withdrawal amount must be less or equal to the balance");
        return balance;
    }
    public double getBalance(){
        return balance;
    }
    public void displayDetails(){
        print("Balance: R"+new DecimalFormat("0.00").format(balance));
    }
}


public static void print(String content){
    System.out.println(content);
}