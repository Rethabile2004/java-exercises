void main(){
    EmployeeRole emp1=EmployeeRole.DEVELOPER;
    EmployeeRole emp2=EmployeeRole.MANAGER;
    EmployeeRole emp3 = EmployeeRole.DESIGNER;
    emp1.displayDetails();
    emp3.displayDetails();
    emp2.displayDetails();
    OrderStatus ord1 = OrderStatus.DELIVERED;
    System.out.println(ord1.description);
    var list = new ArrayList<String>();
    list.add("One");
    list.add("Two");
    list.add("Three");
    for (String num : list) {
        System.out.println(num);
    }
    Product p = new Product("Hp laptop", "HP42", 16645.235);
    System.out.println(p.toString());
//    try {
        BankAccount bankAccount = new BankAccount("85902", -26465);
        bankAccount.displayAccount();
//    } catch (Exception e) {
//        throw new RuntimeException(e);
//    }
    switchDemo();
}

enum EmployeeRole{
    MANAGER("Amanda","Manager"),
    DEVELOPER("Finn","Dev"),
    DESIGNER("Jamie","Designer"),
    INTERN("Eric","Intern");
    private final String name, role;
    EmployeeRole(String name,String role){
        this.name = name;
        this.role = role;
    }
    void displayDetails(){
        System.out.println("Name: " + name + "\nRole: " + role);
    }
}

enum OrderStatus {
    PENDING("Order is pending..."), PROCESSING("Processing..."), SHIPPED("Order has been shipped..."),
    DELIVERED("Order has been delivered"),
    ;
    private final String description;
    OrderStatus(String desc){
        this.description = desc;
    }
    public void getDescription(){
        System.out.println(description);
    }
}

record Product(String pName, String pId, double pPrice) {

}
record BankAccount(String accountNumber,double balance){
    BankAccount{
        if(balance<0){
            try {
                throw new Exception("Cannot accept a negative balance");
            } catch (Exception e) {
                balance=0;
                System.out.println(e.getMessage());
            }
        }

    }
    public void displayAccount(){
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
    }
}

public static void switchDemo(){
    Scanner scanner = new Scanner(System.in);
    int num;

    System.out.print("Enter a number between 1 and 7: ");
    num = scanner.nextInt();
    String weekday = switch (num) {
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        case 7 -> "Sunday";
        default -> "Invalid day";
    };
    System.out.println("Day of the week: " + weekday);
}

