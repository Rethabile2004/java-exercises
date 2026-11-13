//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
/*    Student student1 =new Student("Rethabile","222054864","Adv.Dip IT",22);
    Student student2 =new Student("Eric","222054864","Adv.Dip IT",22);
    Student student3 =new Student("Siase","222054864","Adv.Dip IT",22);
    student1.displayDetails();
    student3.displayDetails();
    student2.displayDetails();

    Employee emp1 = new Employee("Adam", "JJ54424", "IT", 15468.55);
    emp1.displayDetails();
    print("Annual salary: " + emp1.calculateAnnualSalary());
    print(String.format("Employee bonus(1.6%%): R%.2f", emp1.calculateBonus(1.5)));
    print(String.format("Employee bonus(1.6%%): R%.2f", emp1.calculateBonus(1.3)));
    Rectangle rec = new Rectangle(4.9, 16.7);
    rec.displayDetails();
 */
    BankAccount account = new BankAccount("Samantha", "040555654777", 2000);
    account.withdraw(750);
    account.displayBalance();
    account.withdraw(8000);
    account.displayBalance();
}
public static class Student{
    String name;
    String studentNumber;
    String course;
    int age;
    public Student(String name,String studentNumber,String course,int age){
        this.name=name;
        this.studentNumber=course;
        this.course=course;
        this.age=age;
    }
    public void displayDetails(){
        print("======================================");
        print("Name: "+name);
        print("Student number: "+studentNumber);
        print("Course: "+course);
        print("Age: " + age);
        print("======================================");
        print("");
    }
}

public static class Employee{
    String name;
    String empNumber;
    String department;
    double salary;

    public Employee(String name, String empNumber, String department, double salary) {

        this.name = name;
        this.department = department;
        this.empNumber = empNumber;
        this.salary = salary;
    }
    public void displayDetails(){
        print("==================================");
        print("Employee name: " + name);
        print("Employee number: " + empNumber);
        print("Department: " + department);
        print("Salary: R" + salary);
        print("==================================");
    }
    public double calculateAnnualSalary(){
        return salary * 12;
    }
    public double calculateBonus(double percentage){
        return salary * percentage;
    }
}

public class Rectangle{
    double length;
    double width;

    public Rectangle(double l, double w) {

        length = l;
        width = w;
    }
    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return 2*(length + width);
    }
    public void displayDetails(){
        print(String.format("Length: %.2f\tWidth: %.2f", length, width));
        print(String.format("Area: %.2f", calculateArea()));
        print(String.format("Perimiter : %.2f", calculatePerimeter()));
    }
}

public class BankAccount{
    String accountHolder,accountNumber;
    double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount>0){
            print(String.format("Depositing... R%.2f.... to R%.2f", amount, balance));
            balance += amount;
        }else{
            print("Negative numbers not allowed");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            print(String.format("Widthdrawing... R%.2f.... from R%.2f", amount, balance));
            balance -= amount;
        } else {
            print("Invalid withdrawal amount.");
        }
    }
    public void displayBalance(){
        print("Current balance: " + balance);
    }
}

public static void print(String content){
    System.out.println(content);
}
