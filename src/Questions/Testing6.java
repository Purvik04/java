package Questions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotActiveException;

public class Testing6 {
    public static void main(String[] args) throws IOException{
        try {
            throw new IOException("Original IOException");
        } catch (IOException e) {
            e = new FileNotFoundException("Unchecked Exception");
            throw e;
        }
    }
}
