package Questions;

public class Testing2 {
    public static void main(String[] args) {
        String s;
        int x = 0;
        if (x < 0){
           s = "0";
        }
        else{
            s = "1";
        }

        System.out.println(s);
    }

    /*
    *if else statements:- no code unreachable error
    *but only in one case
    * if(true){
    * return;but ----> will give compilation error
    * //any statements
    * }
    * */

}
