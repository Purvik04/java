package Questions;

import java.io.IOException;

class Parent{
    void hello() throws IOException{
        System.out.println("from parent");
    }
}

class Child extends Parent{
    void hello() throws RuntimeException{
        System.out.println("from child");
    }
}
public class Testing9 {
    public static void main(String[] args) {
//        try {
//            Parent p = new Child();
//            p.hello();
                /*
                * if i create parent ref then i must have to handle or throws IOException
                * but if use child ref then i don't have to handle or throws it
                * and for RuntimeException we dont have to do anything
                * */
//        } catch (IOException e) {
//            System.out.println("hello");
//        }
    }
}
