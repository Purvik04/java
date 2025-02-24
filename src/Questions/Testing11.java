package Questions;

public class Testing11 {
    public static void main(String[] args) {
        String s = null;
        Object o = null;
        System.out.println(s + s); //nullnull
//        System.out.println(o + o); ---> will give compilation error
        System.out.println(o + s); //nullnull
        System.out.println(s + o); //nullnull
    }
}

/*
In Java, when using the + operator:
If at least one operand is a String, Java automatically converts the other operand to a String and performs concatenation.
If both operands are not Strings, the + operator is treated as arithmetic addition (which is only valid for numbers).
 */
