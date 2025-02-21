package Questions;

class Test {
    private static void div(int i, int j) {
        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            throw (RuntimeException) e;  // This line throws an exception
        }
    }

    public static void main(String[] args) {
        try {
            div(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("AE");
        } catch (RuntimeException e) {
            System.out.println("RE");
        }
    }
}

/*Step-by-Step Execution
div(5, 0) is called in main().
inside div(), 5 / 0 causes an ArithmeticException (AE) (java.lang.ArithmeticException: / by zero).
The catch (ArithmeticException e) block catches the exception.
Inside the catch, throw (RuntimeException) e; throws the same exception (AE) but cast to RuntimeException.
Since ArithmeticException is a subclass of RuntimeException, casting it does nothing and it remains an ArithmeticException.
*/


