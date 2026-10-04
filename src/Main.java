//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//    exercise1();
//    exercise2();
//    exercise3();
//    exercise4();
//    exercise5();
//    exercise6();
//exercise7();
    exercise9();
}
void exercise1(){
    System.out.println("Programming in Java is fun!!");
}
void exercise2(){
    String name="Rethabile";
    String studentNumber = "222052986";
    String homeCity="Bloemfontein";
    int age=22;
    System.out.println("My name is "+name);
    System.out.println("My student number is "+studentNumber);
    System.out.println("I live in "+homeCity);
    System.out.println("I am "+age+" years old");
}
void exercise3(){
    System.out.println("EEEEEEEE");
    System.out.println("EE");
    System.out.println("EEEEEEEE");
    System.out.println("EE");
    System.out.println("EEEEEEEE");
}
void exercise4(){
    String studentName="Eric";
    String courseName = "Advanced Diploma in IT";
    double courseFee=15123.99;
    int courseDuration=1;
    System.out.printf("Student: %s",studentName);
    System.out.println();
    System.out.printf("Course: %s",courseName);
    System.out.println();
    System.out.printf("Course Fee: R%f", courseFee);
    System.out.println();
    System.out.printf("Duration: %d year",courseDuration);
    System.out.println();
}
void exercise5(){
    Scanner scanner=new Scanner(System.in);

    System.out.print("What is your name: ");
    String name=scanner.nextLine();

    System.out.print("How old are you? ");
    int age=scanner.nextInt();

    System.out.print("What is your favorite programming language? ");
    String favorite=scanner.nextLine();


    System.out.println();
    System.out.println("Name: " + name);
    System.out.println("Age: "+age);
    System.out.println("Favorite programming language: "+favorite);
    System.out.println();

}

void exercise6(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your student number: ");
    String studentNumber = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.print("Enter your course: ");
    String course = scanner.nextLine();
    System.out.print("Enter your current average mark: ");
    double averageMark = scanner.nextDouble();

    //output
    System.out.println("Student Name: " + name);
    System.out.println("Student Number: " + studentNumber);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
    System.out.println("Average Mark: " + averageMark);

}

void exercise7(){
    double length, width, area, perimiter;
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the length: ");
    length=scanner.nextDouble();
    System.out.print("Enter the width: ");
    width=scanner.nextDouble();

    area=length*width;
    perimiter=2*(length+width);

    System.out.println("Length: "+length);
    System.out.println("Width: "+width);
    System.out.println("Area: "+area);
    System.out.println("Perimiter: "+perimiter);

}

void exercise8(){
    String productName;
    double price, totalCost;
    int quantityPurchased;
    Scanner scanner =new Scanner(System.in);
    System.out.print("Product Name: ");
    productName=scanner.nextLine();
    System.out.print("Product Price: ");
    price=scanner.nextDouble();
    System.out.print("Quantity Purchased: ");
    quantityPurchased = scanner.nextInt();
    totalCost=price*quantityPurchased;
    System.out.println("Product: "+productName);
    System.out.println("Price: "+price);
    System.out.println("Quantity: "+quantityPurchased);
    System.out.printf("Total Cost: %.2f",totalCost);
}
void exercise9(){
        double temperature;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the temperatute: ");
        temperature=scanner.nextDouble();
        double fahrenheit=temperature*9/5+32;
        System.out.println("Celsius: "+temperature);
    System.out.println("Fahrenheit: "+fahrenheit);

}

void exercise(){
    String name, studentNumber, course;
    int age, numberOfModules;
    double averege;
    Scanner scanner =new Scanner(System.in);
    System.out.print("Enter your name: ");
    name=scanner.nextLine();
    System.out.print("Enter your student number: ");
    studentNumber=scanner.nextLine();
    System.out.print("Enter your age: ");
    age=scanner.nextInt();
    System.out.print("Enter your course: ");
    course=scanner.nextLine();
    System.out.print("Enter your first semester average: ");
    averege=scanner.nextDouble();
    System.out.print("Enter the number of modules you are taking: ");
    numberOfModules=scanner.nextInt();

    System.out.println("=== Student Registration ===");
    System.out.println("Name: " + name);
    System.out.println("Course name: " + course);
    System.out.println("Student number: " + studentNumber);
    System.out.println("Age: " + age);
    System.out.println("Semester average: " + averege);
    System.out.println("Modules taken: " + numberOfModules);
}