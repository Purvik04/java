/*
=== 1 === One file can have only one public class
Otherwise it will give **compilation error

=== 2 === File name should be same as **classname which is declared to be public otherwise it will give error...
*/

public class Main {
    // JVM by default calls main() method as a default
    public static void main(String[] args){
        System.out.println("Hey from MAIN");
    }

    // If we want to execute code without main() we can use 
    static {
        System.out.println("Hey from STATIC BLOCK");
        // System provides access to system resources
    }

    /*
    If we have both main() and static block
    It will execute static block first
    Then it will execute main()
    Otherwise it will throw runtime error
    */

}

