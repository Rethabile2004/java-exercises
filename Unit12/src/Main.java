//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    exercise1();
//    exercise3();
    try {
//        exercise4();
        Person jeff=new Person("Jess",55);
//    }catch (FileNotFoundException e){
//        System.out.print("Unable to locate the file");
    }
    catch (IllegalAccessException e){
        System.out.print("Invalid argument.");
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

class Person{
    private String name;
    private int age;

    public Person(String pName, int pAge) throws IllegalAccessException {
        name = pName;
        age = pAge;
    }
    public void displayDetails(){
        System.out.print("Name: " + name + "\nAge: " + age);
    }
}