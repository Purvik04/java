package Questions;

import TestingPackage.AA;

import java.io.FileNotFoundException;
import java.io.IOException;



public class Testing3 extends AA{

    public static void main(String[] args) {
        System.out.println(new Testing3().i);
//        System.out.println(new AA().i); error can access it using parent ref

    }
}
