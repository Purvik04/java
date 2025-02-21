package Questions;

interface M {
    public static void log() {
        System.out.println("M");
    }
}

abstract class A {
    public static void log() {
        System.out.println("N");
    }
}

class MyClass extends A implements M {}

public class Testing7 {
    public static void main(String[] args) {
        M obj1 = new MyClass();
        M.log(); //Line n1

        A obj2 = new MyClass();
        obj2.log(); //Line n2

        MyClass obj3 = new MyClass();
        obj3.log(); //Line n3
    }
}
