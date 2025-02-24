package Questions;

public class Testing8 {

    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError("heello");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /*
    * Error are not handled by Exception
    * we have to use Error e inside catch*/

}
