    public  void main(String[] args) {
        exercise5();


    }

void exercise1(){
    int number = -15;
    if(number>0){
        System.out.println("Positive number");
    }else if(number<0){
        System.out.println("Negative number");
    }else{
        System.out.println("Number is equal to zero");
    }
}

void exercise2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number=input.nextInt();
    if(number%2==0){
        System.out.println(number+ " is an even number");
    }else{
        System.out.println(number+ " is an odd number");
    }
}

void exercise3(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the students name: ");
    String name =scanner.nextLine();
    System.out.print("Enter the students mark: ");
    int mark =scanner.nextInt();

    char grade;

    if(mark>100||mark<0){
        System.out.println("Invalid mark entered. (mark must be between 0 - 100)");
    }else{
    if(mark >=80&&mark<=100){
        grade='A';
    }else if(mark>=70){
        grade='B';
    } else if (mark>=60) {
        grade='C';
    } else if (mark>=50) {
        grade='D';
    }else {
        grade='F';
    }
    System.out.println();
    System.out.println(String.format("Name: %s\nMark: %d\nGrade: %c",name,mark,grade));

    }

}

void exercise4(){
    int age;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter your age: ");
    age=scanner.nextInt();
    String category;
    if(age>=36&&age<=59){
        category="Adult";
    }else if(age>=20){
        category="Young Adult";
    }else if(age>=13){
        category="Teenager";
    } else if (age>=0) {
        category="Child";
    }else{
        category="Senior Citizen";
    }
}

void exercise5(){
    int num1,num2;
    Scanner scanner =new Scanner(System.in);
    System.out.print("Enter a number(1): ");
    num1=scanner.nextInt();
    System.out.print("Enter a number(2): ");
    num2=scanner.nextInt();
    char operation;
    int result=0;
    System.out.print("Enter the operation(/,*,-,+): ");
    operation=scanner.next().charAt(0);
    switch (operation){
        case '+':
            result=num1+num2;
            break;
        case '-':
            result=num1-num2;
            break;
        case '*':
            result=num1*num2;
            break;
        case '/':
            result=num1/num2;
            break;
        default:
            System.out.println("Invalid input");
            result=0;
            break;

    }
    System.out.println(String.format("%d%c%d=%d",num1,operation,num2,result));
}