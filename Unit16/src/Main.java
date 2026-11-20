//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    List<String> employees = List.of(
//            "John", "Sarah", "Michael", "David", "Jessica"
//    );
//    employees.stream().filter(name -> name.length() > 4).forEach(System.out::println);
//
//    employees.stream().map(String::toUpperCase).forEach(System.out::println);
//
//    List<Double> prices = List.of(100.0, 250.0, 500.0);
//    List<Double> discountPrices = prices.stream().map(p -> p * 0.9).toList();
//    System.out.println(discountPrices);
//
//    System.out.println(prices);
//    List<Integer> numbers = List.of(10, 20, 30, 40, 50);
//    numbers.stream().sorted().forEach(System.out::println);
//    numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//    numbers.stream().distinct().forEach(System.out::println);
//    exercise1();
//    exercise2();
//    exercise3();
//    exercise4();
    exercise5();

}

void exercise1(){
    List<Integer> numbers = List.of(10, 11, 12, 3, 13, 14, 15, 16, 78, 78, 4717, 17);
    System.out.println("=====================");
    numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    System.out.println("=====================");
    numbers.stream().filter(num->num>50).forEach(System.out::println);
    System.out.println("=====================");
    long count = numbers.stream().filter(num -> num > 50).count();
    System.out.println("50 Count: "+count);
    System.out.println("=====================");
}


void exercise2(){
    List<String> names = List.of("Lery", "Smith", "Emily", "Timothy", "Robbert");
    names.stream().map(String::toUpperCase).forEach(System.out::println);
    names.stream().map(String::length).forEach(System.out::println);
    List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
    for(String name:upperCaseNames){
        System.out.println(name);
    }
}

void exercise3(){
    List<Integer> numbers = List.of(40, 10, 30, 20, 10, 50, 30, 60, 20);
    numbers = numbers.stream().distinct().toList();
    numbers = numbers.stream().sorted().toList();
    numbers.stream().map(n -> n).forEach(System.out::println);

}

void exercise4(){
    List<Double> salaries = List.of(12000.8, 18000.00, 25000.00, 15000.00, 30000.00, 22000.00);
    double total = salaries.stream().reduce((double) 0, Double::sum);
    System.out.println("Total: " + total);
}

void exercise5(){
    Optional<String> name = Optional.of("Rethabile");// when you know the value is not null
    String surname = null;
    Optional<String> surnameRef = Optional.ofNullable(surname);// used when you know the value might be null
    surnameRef.orElse("Eriri");
//    surnameRef.
    Optional<String> middleName = Optional.empty();// creates an empty optional
    middleName.orElseGet(()->"Man");
    if(name.isPresent()){
        System.out.println(name.get());
    }
    if(surnameRef.isPresent()){
        System.out.println(surnameRef.get());
    }
    if(middleName.isPresent()){
        System.out.println(middleName.get());
    }
}