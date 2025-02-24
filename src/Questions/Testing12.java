package Questions;

public class Testing12 {
    public static void main(String[] args) {
        String s = "Purvik";
        StringBuffer sb = new StringBuffer("Purvik");
        StringBuilder sb2 = new StringBuilder("Purvik");
        CharSequence arr = "Purvik";

        System.out.println(s.equals(sb));
        System.out.println(s.contentEquals(sb2));
    }
}
