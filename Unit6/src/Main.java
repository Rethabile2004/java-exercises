//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    exercise1();
//    exercise2();
//    exercise3();
//    exercise5();
    exercise6();
}


void exercise1(){
    int[] numArray = {15, 25, 35, 45, 55};
    for (int j : numArray) {
        System.out.print(j + " ");
    }
    System.out.println("Length: " + numArray.length);
    System.out.println("First: " + numArray[0]);
    System.out.println("Last: " + numArray[numArray.length-1]);
}

void exercise2(){
    int[]numArray=new int[5];

    Scanner scanner =new Scanner(System.in);
    for(int j=0;j<5;j++){
        System.out.print("Enter a number: ");

        numArray[j]=scanner.nextInt();
        System.out.println(numArray[j]);
    }
    for(int p:numArray){
        System.out.print(p+" ");
    }
}

void exercise3(){
    int[] numArray = {75, 68, 90, 55};
    int sum = 0;
    double average = 0;
    for(int j:numArray){
        sum+=j;
    }
    average= (double) sum /numArray.length;
    System.out.println("Average: " + average);
    System.out.println("Sum: " + sum);
}

void exercise4(){
    int[] numArray = new int[8];
    Scanner scanner =new Scanner(System.in);
    for (int i=0;i<numArray.length;i++){
        System.out.print("Enter a number: ");
        numArray[i]=scanner.nextInt();
    }
    int largest=numArray[0],smallest=numArray[0];
    for (int j:numArray){
        if(j>largest){
            largest=j;
        }
        if(j<smallest){
            smallest=j;
        }
    }
    System.out.println("Smallest: " + smallest);
    System.out.println("Smallest: " + largest);
}

void exercise5(){
    int[] numArray = {51, 36, 55, 45, 36, 23, 14, 52, 88, 64};
    int evenCount = 0, oddCount = 0;
    for(int j:numArray){
        if(j%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
    }
    System.out.println("Even numbers found: " + evenCount + "\nOdd numbers found: " + oddCount);
}

void exercise6(){
    int[] numArray = {12, 45, 23, 67, 89, 34, 56};
    int searchVal = 0;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter a search value: ");
    searchVal = scanner.nextInt();
    int index = -1;
    for(int j=0;j<numArray.length;j++){
        if (numArray[j] == searchVal) {
            index = j;
            System.out.println("Found: " + numArray[j]);
            System.out.println("Index: " + j);
            return;
        }
    }

    if(index==-1){
        System.out.println(searchVal+" not found.");
    }
}