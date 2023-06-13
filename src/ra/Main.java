package ra;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("day la myString");
        System.out.println(myClass.getMyString());
        myClass.setMyString("update");
        System.out.println(myClass.getMyString());
    }
}