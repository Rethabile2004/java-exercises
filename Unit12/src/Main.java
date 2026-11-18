//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
class Person{
    private String name;
    private int age;

    public Person(String pName, int pAge) throws IllegalArgumentException {
        if(age<18)
            throw new IllegalArgumentException("Age must be above 18.");
        name = pName;
        age = pAge;
    }
    public void displayDetails(){
        System.out.print("Name: " + name + "\nAge: " + age);
    }
}
void prompt(String message){
    System.out.print(message+": ");

}
void regSys() throws Exception{
    String name, email, passwd;
    int age;
    Scanner scanner = new Scanner(System.in);
    prompt("Enter your name");
    name = scanner.nextLine();
    prompt("Email");
    email = scanner.nextLine();
    if(!email.contains("@")){
        throw new Exception("Please enter a valid email");
    }
    prompt("Age");
    age=scanner.nextInt();
    if(age<18){
        throw new Exception("Must be at least 18 to register.");
    }
    prompt("Password");
    passwd = scanner.nextLine();

    System.out.print("Processing...\nProcessing...\nProcessing...\n");

scanner.close();
    System.out.print("Registered successfully.");

}
void main() {
    try {
        regSys();
    }
    catch (Exception e){
        System.out.print(e.getMessage());

    }
}

void exercise1() {
    int num1, num2;
    int result = 0;
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Enter a number(1): ");
        num1 = scanner.nextInt();
        System.out.print("Enter a number(2): ");
        num2 = scanner.nextInt();
        result = num1 / num2;
        System.out.print("result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("You cannot divide by zero");
    }
    System.out.println("Program finished");

}

void exercise2() {
    int[] myArray = {10, 20, 30, 40, 50};
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Enter an array index (0-4): ");
        int arrayIndex = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        myArray[arrayIndex] = number;

        System.out.println("Updated array element: " + myArray[arrayIndex]);

    } catch (InputMismatchException e) {
        System.out.println("Please enter valid integers.");

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid array index.");
    }
}

void exercise3(){
    int num1,num2;
    Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Enter the 1st number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the 2st number: ");
        num2 = scanner.nextInt();
        System.out.print("Result=" + num1 / num2);
    }catch (ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }finally {
        System.out.print("Operation completed.");
    }
}

void exercise4() throws FileNotFoundException{
    File file = new File("text.txt");
    Scanner scanner = new Scanner(file);
    while (scanner.hasNext()){
        System.out.println(scanner.nextLine());
    }
    scanner.close();
}

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);}
}

public class BankAccount{
    private int accountNumber;
    private double balance;
    public BankAccount(int a,double b){
        accountNumber = a;
        balance = b;
    }
    public void withdraw(double amount)throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Withdrawal amount is greater than current balance");
        }
        System.out.printf("Withdrawing....\n\nSuccess\nCurrent balance: %.2f", balance);

    }
}