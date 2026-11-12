//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    displayWelcome();
    displayStudentDetails("Rethabile Eric Siase", "2220654862", "Adv. Diploma IT");
    System.out.print("\nSum: " + addNumbers(155, 55) + "\n");

}

public static void displayWelcome(){
    System.out.print("Welcome to Java Programming!n\n");
}

public static void displayStudentDetails(String name, String studentNumber, String course){
    System.out.printf("Name: %s\nStudent Number: %s\nCourse: %s",name,studentNumber,course);
}

public static int addNumbers(int num1,int num2){
    return num1+num2;
}

public static int add(int num1,int num2){
    return num1+num2;
}

public static int multiply(int num1,int num2){
    return num1*num2;

}
public static int subtract(int num1,int num2){
    return num1-num2;

}

public static int divide(int num1, int num2) {
    if(num1==0||num2==0){
        return 0;
    }
    return num1 / num2;
}

public static boolean isEven(int number){
    return number % 2 == 0;
}

public static String calculateGrade(int mark){
    String result = "F";
    if(mark>=80&&mark<=100){
        result = "A";
    }else if(mark>=70){
        result = "B";
    }else if(mark>=60){
        result = "C";
    }else if(mark>=50){
        result = "D";
    }else if(mark>=0){
        result = "F";
    }else{
        result = "Invalid result";
    }
    return result;
}