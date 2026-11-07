//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    exercise4(new Scanner(System.in));
}
void exercise1(Scanner scanner){
    int number1, number2, sum, difference, product;
    double remainder;
    System.out.print("Enter number 1: ");
    number1=scanner.nextInt();
    System.out.print("Enter number 2: ");
    number2 = scanner.nextInt();
    sum=number1+number2;
    difference=number1-number2;
    product=number1*number2;
    remainder=number1%number2;
    System.out.println("Sum: "+sum);
    System.out.println("Difference: "+difference);
    System.out.println("Product: "+product);
    System.out.println("Remainder: "+remainder);
}

void exercise2(Scanner scanner){
    int number1 = 5, number2 = 17;
    int intResult = number1 / number2;
    double doubleResult = (double) number1 / number2;
    double doubleResult1 = number1 / (double) number2;
    System.out.println("Int result: "+intResult);
    System.out.println("Double result: "+doubleResult);
    System.out.println("Double result: "+doubleResult1);
}

void exercise3(Scanner scanner) {
    boolean fullTime, experience, employed;
    System.out.print("Are you a full-time student? ");
    fullTime=scanner.nextBoolean();
    System.out.print("Do you have previous programming experience? ");
    experience=scanner.nextBoolean();
    System.out.print("Are you currently employed? ");
    employed=scanner.nextBoolean();
    System.out.println("Full-time student: " + fullTime);
    System.out.println("Previous programming experience: " + experience);
    System.out.println("Currently employed: " + employed);
}

void exercise4(Scanner scanner){
    char initial;
    String surname;

    System.out.print("Initial: ");
    initial=scanner.next().charAt(0);
    System.out.print("Surname: ");

    surname = scanner.nextLine();
    System.out.print(String.format("Your initials and surname are: %c. %s",initial,surname));
}

void exercise5(Scanner scanner){
    int number = 10;
    System.out.println(number++);
    System.out.println(++number);
    System.out.println(number--);
    System.out.println(--number);
}

    void exercise10(Scanner scanner) {
        Scanner input =scanner;

        System.out.print("Enter class test mark: ");
        int classTest = input.nextInt();

        System.out.print("Enter main test mark: ");
        int mainTest = input.nextInt();

        System.out.print("Enter practical mark: ");
        int practical = input.nextInt();

        System.out.print("Have all required assignments been submitted? (true/false): ");
        boolean assignmentsSubmitted = input.nextBoolean();

        double courseMark = classTest * 0.25 + mainTest * 0.40 + practical * 0.35;

        boolean classTestPassed = classTest >= 50;
        boolean mainTestPassed = mainTest >= 50;
        boolean practicalPassed = practical >= 50;
        boolean courseMarkPassed = courseMark >= 50;
        boolean assignmentsCompleted = assignmentsSubmitted;
        boolean qualifies = courseMarkPassed && assignmentsCompleted;

        System.out.printf("%nCourse Mark: %.2f%n", courseMark);
        System.out.println("Class Test Passed: " + classTestPassed);
        System.out.println("Main Test Passed: " + mainTestPassed);
        System.out.println("Practical Passed: " + practicalPassed);
        System.out.println("Course Mark Passed: " + courseMarkPassed);
        System.out.println("Assignments Submitted: " + assignmentsCompleted);
        System.out.println("Qualifies for Final Assessment: " + qualifies);

        input.close();
    }
