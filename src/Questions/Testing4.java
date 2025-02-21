package Questions;

public class Testing4 {
    static int i = fs();
    static {
        System.out.println("hello from static block");
    }
    static Testing4 obj = new Testing4();
    static String name = "James";

    Testing4() {
        System.out.println(name);
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(i);
    }

    public static  int fs(){
        System.out.println("hello from static method");
        return 10;
    }
}
