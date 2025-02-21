package Questions;

interface Document {
    default String getType() {
        return "TEXT";
    }
}

interface WordDocument extends Document {
    String getType();
}

/*
can override the default method of super type with abstract modifier. interface WordDocument compiles successfully.

class Word implements WordDocument and as WordDocument interface has abstract method getType(),
and as class Word doesn't implement the getType() method hence it causes compilation failure.
 */

//class Word implements WordDocument {}

public class Testing5 {
    public static void main(String[] args) {
//        Document doc = new Word(); //Line n1
//        System.out.println(doc.getType()); //Line n2
    }
}
