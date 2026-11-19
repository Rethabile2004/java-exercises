//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Storage<String> s = new Storage<>("Erick");
//    Storage<Integer> x = new Storage<>(18);
//    Storage<Double> j = new Storage<>(15.15);
//    s.displayItem();
//    x.displayItem();
//    j.displayItem();
//    StudentRecord<String, Integer> one=
//            new StudentRecord<String, Integer>("Reee",22);
//    one.displayRecord();
    int[] array = new int[]{10, 20, 30, 40, 50};
    Utility.displayArray(new Integer[]{10, 10, 10, 10});
    Utility.displayArray(new String[]{"One","Two","Three"});
    Utility.displayArray(new Double[]{15.5,12.2});
    Utility.getFirstElement(new Integer[]{12, 22, 33});
}
public static class Storage<T>{
    private T item;
    public Storage(T i){
        item = i;
    }
    public void setItem(T newItem){
        this.item = newItem;
    }
    public T getItem(){
        return item;
    }
    public void displayItem(){
        System.out.println(item);
    }
}

public static class StudentRecord<K, V> {
    private K key;
    private V value;

    public StudentRecord(K key, V value) {
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;}
    public V getValue(){
        return value;}
    public void displayRecord(){
        System.out.println("Key: " + key + "\nValue: " + value);
    }
}

public static class Utility{

    public static <T> void displayArray(T[] array) {
        for(T item:array){
            System.out.print(item + "");
        }
    }
    public static <T> T getFirstElement(T[]items){
        return items[0];
    }
}