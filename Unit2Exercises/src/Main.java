void main(){
    exercise9();
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
