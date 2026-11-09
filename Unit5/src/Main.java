//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    exercise1();
//    exercise2();
//    exercise3();
//    exercise4();
//    exercise5();
    exercise10();
}

void exercise1(){
    for(int i=1;i<=20;i++){
        System.out.print(i+" ");
    }
}

void exercise2(){
    int evenCount=0;
    for(int i=1;i<=50;i++){
        if(i%2==0){
        System.out.print(i+" ");
            evenCount++;
        }
    }
    System.out.println("\nEven numbers found: "+evenCount);
}

void exercise3(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number =scanner.nextInt();
    for(int i=1;i<=12;i++){
        System.out.printf("%d x %d = %d%n",number,i,number*i);
    }
}

void exercise4(){
    int sum=0,num;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a number: ");
    num=scanner.nextInt();
    for(int i=1;i<=num;i++){
        sum+=i;
    }
    System.out.print("Sum: "+sum);
}

void exercise5(){
    int num;
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    num = scanner.nextInt();
//    int count = 1;

    if(num>=1) {
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
        System.out.println("Liftoff!");
    }
}

void exercise6(){
    String correctPassword = "Java2026", userInput;
    int attemptCount=0;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your password: ");
    userInput=scanner.nextLine();
    while(!Objects.equals(userInput, correctPassword)){
        attemptCount++;
        System.out.print("Enter your password: ");
        userInput=scanner.nextLine();
    }
    System.out.println("Access granted");
    System.out.println("Attempts made: "+attemptCount);
}

void exercise7(){
    Scanner scanner = new Scanner(System.in);
    int option=0,num1,num2;

    do {
        menu();
        System.out.print("Enter a option: ");
        option = scanner.nextInt();
        System.out.print("1st number: ");
        num1 = scanner.nextInt();
        System.out.print("2nd number: ");
        num2 = scanner.nextInt();
        calc(scanner,option,num1,num2);
    }while(option!=5);
}

void menu(){
    System.out.println();
    System.out.print("=== Calculator ===");
    System.out.print("\n1. Addition");
    System.out.print("\n2. Subtraction");
    System.out.print("\n3. Multiplication");
    System.out.print("\n4. Division");
    System.out.print("\n5. Exit");
    System.out.println();
}

void calc(Scanner scanner, int option,int num1,int num2) {

    switch (option) {
        case 1:
            System.out.printf("%d+%d=%d", num1, num2, num1 + num2);
            break;
        case 2:
            System.out.printf("%d-%d=%d", num1, num2, num1 - num2);
            break;
        case 3:
            System.out.printf("%dx%d=%d", num1, num2, num1 * num2);
            break;
        case 4:
            if (num1 == 0 || num2 == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }
            System.out.printf("%d/%d=%d", num1, num2, num1 / num2);
            break;
        case 5:
            System.out.println("Exitingggg.....\nThank you for using our system.");
            break;
        default:
            System.out.println("Invalid input");
            break;
    }
}

void exercise10(){
    int count=1;
    for (int i =1;i<=6;i++){
        for (int j=1;j<=count;j++){
            System.out.print(j);
        }
        System.out.print("\n");
        count++;
    }
}