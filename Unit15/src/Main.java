//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Calculator calculator = Integer::sum;
    System.out.print(calculator.addition(46, 5));
    Greeting morning=()->{
        System.out.println("\nGood morning y'all.");
    };
    morning.sayHello();
    Predicate<Integer> isAdult = age -> age >= 18;
    System.out.println(isAdult.test(22));
    System.out.println(isAdult.test(15));
    Consumer<String> display = name -> {
        System.out.println("Hello " + name+"!");
    };
    display.accept("Eric");
    Supplier<String> message = () -> "Welcome to java";
    System.out.println(message.get());
    Function<String, Integer> getLength = name -> name.length();
    System.out.println(getLength.apply("Lery"));
    Employee emp1 = new Employee("Kim", 22, 24653.6);
    Predicate<Employee> isEarningMoreThank15k = (employee) -> employee.salary > 15000;
    System.out.println("Is earning more than 15k?: " + isEarningMoreThank15k.test(emp1));
    Consumer<Employee> displayDetails = employee -> {
        System.out.printf("Name: %s\nAge: %d\nSalary: R%.2f\n", employee.name, employee.age, employee.salary);
    };
    displayDetails.accept(emp1);
    Function<Employee, String> getName = employee -> employee.name;
    System.out.println(getName.apply(emp1));
    Supplier<Employee> getDefaultEmployee = () -> new Employee("No name", 1, 0);
    System.out.println(getDefaultEmployee.get().toString());
    ;
    Notification email=(m)->{
        System.out.println("Email notification::" + m);
    };
    Notification sms = (m) -> {
        System.out.println("SMS notification::" + m);
    };
    Notification push = (m) -> {
        System.out.println("Push notification::" + m);
    };
    email.display("Drinks on me king");
    sms.display("I miss you");
    push.display("I love you.");

}

@FunctionalInterface
interface Calculator{
    int addition(int a,int b);
}

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public static class Employee{
    private final String name;
    private final int age;
    private final double salary;
    public Employee(String name,int age,double salary){
        this.name = name;
        this.age=age;
        this.salary=salary;
    }

}

@FunctionalInterface
interface Notification{
    void display(String message);
}

void deviceNotification(Notification notification){
    notification.;
}