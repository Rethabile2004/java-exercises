//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Calculator calculator = Integer::sum;
    System.out.print(calculator.addition(46,5));
}

@FunctionalInterface
interface Calculator{
    int addition(int a,int b);
}