package Questions;

import java.io.FileNotFoundException;

public class Testing13 {

    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }
        finally{
            System.out.println("final");
        }
    }

}