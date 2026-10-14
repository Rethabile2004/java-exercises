 void main(){
    exercise17();
}

void exercise1(){
    String studentName="Eric";
    String courseName="Advanced Diploma in IT";
    System.out.println(studentName+" is studying "+courseName );
}

void exercise2(){
    String studentName="Eric";
    String studentNumber="1234656789";
    int age=22;
    double average=89.5;
    System.out.println(String.format("Name: %s\nStudent Number: %s\nAge: %d\nAverage: %.2f",studentName,studentNumber,age,average));
}

void exercise3(){
    String studentName = "Eric";
    String courseName = "java";
    double courseFee=5000.00;
    System.out.println(studentName + " is studying " + courseName + " costing " + courseFee);
    System.out.println(String.format("%s is studying %s costing %.0f", studentName, courseName, courseFee));
}

void exercise4(){
    String name="Eric";
    int age=22;
    double average=87.45678;
    System.out.println(String.format("Name: %s\nAge: %d\nAverage: %.2f", name, age, average));
}

void exercise5(){
    String name;
    double price;
    int quantity;
    double total=0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter product name: ");
    name=scanner.nextLine();
    System.out.print("Enter product price: ");
    price=scanner.nextDouble();
    System.out.print("Enter the quantity: ");
    quantity=scanner.nextInt();
    total = price * quantity;
    System.out.println("Product: "+name);
    System.out.println("Price: "+price);
    System.out.println("Quantity: "+quantity);
    System.out.println("Total: "+total);
}

void exercise6(){
    String name = "Eric";
    String course = "Advanced Diploma in IT";

    System.out.println("Name:\t"+name+"\nCourse:\t"+course+"\n\n\"Java is fun!\"\nC:\\Java\\Projects");
}

void exercise7(){
    String name;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your name: ");
    name=scanner.nextLine();
    System.out.println();
    System.out.println("Original: " + name);
    System.out.println("Length: " + name.length());
    System.out.println("Uppercase: " + name.toUpperCase(Locale.ROOT));
    System.out.println("Lowercase: " + name.toLowerCase());
    System.out.println("First character: " + name.charAt(0));

}


void exercise8(){
    String val;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Word: ");
    val=scanner.nextLine();
    System.out.println("First character: "+val.charAt(0));
    System.out.println("Last character: "+val.charAt(val.length()-1));
    System.out.println("First three characters: "+val.substring(0,3));
}
void exercise11(){
    String firstName;
    String surname, city, course;
    int age;
    Scanner scanner=new Scanner(System.in);
    Scanner scanner1=new Scanner(System.in);

    System.out.print("First name: ");
    firstName= scanner.nextLine();

    System.out.print("Surname: ");
    surname= scanner.nextLine();

    System.out.print("Age: ");
    age= scanner.nextInt();

    System.out.print("City: ");
    city=scanner1.nextLine();
    System.out.print("Course: ");
    course=scanner1.nextLine();

    System.out.println(String.format("My name is %s %s, I am %d years old, I live in %s, and I am studying %s.",firstName,surname,age,city,course));
}

void exercise12(){
    String name;
    int empNum;
    double salary,annualSalary;
    Scanner scanner=new Scanner(System.in);

    System.out.print("Employee: ");
    name=scanner.nextLine();
    System.out.print("Employee Number: ");
    empNum=scanner.nextInt();
    System.out.print("Monthly Salary: ");
    salary=scanner.nextDouble();
    annualSalary=salary*12;

    System.out.println(String.format("%s | %s\nSalary: %.2f",name,empNum,salary));

}

void exercise13(){
    boolean fullTime=false, experience, employed;
    Scanner scanner =new Scanner(System.in);
    System.out.print("Are you a full-time student? ");
    fullTime=scanner.nextBoolean();
    System.out.print("Do you have previous programming experience? ");
    experience=scanner.nextBoolean();
    System.out.print("Are you currently employed ");
    employed=scanner.nextBoolean();
    System.out.println(String.format("Full-time student: %b\nPrevious programming experience: %b\nCurrently employed: %b",fullTime,experience,employed));
}

void exercise14(){
    String surname="Siase";
    char initial='S';
    System.out.println(String.format("Your initials and surname are: %c. %s",initial,surname));
}

void exercise15(){
    String product;
    double price;
    int quantity, subtotal;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Product: ");
    product=scanner.nextLine();
    System.out.print("Price: ");
    price=scanner.nextDouble();
    System.out.print("Quantity: ");
    quantity=scanner.nextInt();
    System.out.println("=========================");
    System.out.println("Receipt");
    System.out.println("=========================");
    System.out.println(String.format("Product:\t%s\nPrice:\tR%.2f\nQuantity:\t%d\nSubtotal:\tR%.2f",product,price,quantity,price*quantity));
}

void exercise16(){
    System.out.println("Java Programming\n\tUnit2: Strings\n\t\t\"Formatting\"\n\t\t\tC:\\Java\\Projects");
}

void  exercise17(){
    String name;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Name: ");
    name=scanner.nextLine();
    System.out.println("Number of characters: "+name.length());
    System.out.println("Uppercase: "+name.toUpperCase());
    System.out.println("Lowercase: "+name.toLowerCase());
    System.out.println("First character: "+name.charAt(0));
}