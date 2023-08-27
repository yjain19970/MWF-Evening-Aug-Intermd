package exceptionhandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        String s = "Yash";
//        System.out.println("HELLO...");
//
//        try {
//            if(s.length() == 1) {
//                System.out.println("length is 1");
//            }else{
//                System.out.println("length is > 1");
//            }
//            System.exit(1);
//            return; // returning from here
//        }catch (NullPointerException e){
//            System.out.println("You are not allowed to pass NULL value.");
//            //throw new IllegalArgumentException("Not correct arugment");
//        }finally {
//            System.out.println(" THIS IS FINALLY BLOCK.");
//        }

        Client c = new Client();
        List<Integer> x = new ArrayList<>();
        x.add(0);
        x.add(0);
        c.testFuncForException(x); // THIS IS THE FUNC CALL.
    }

    public void testFuncForException(List<Integer> list){
        try {
            int x = list.get(0); // get the first Index.
            int y =list.get(1); // get the second index.

            int z = x/y;
            System.out.println("VALUE OF Z" + z);
        }catch (NullPointerException e){
            System.out.println("LIST SHOULD NOT BE NULL");
        } catch (IndexOutOfBoundsException | ArithmeticException e){
            System.out.println("LIST SHOULD HAVE ATLEAST 2 ELEMENTS..." + e.fillInStackTrace());
        }finally {
            System.out.println(" Executing finally block. closing connections");
            return;
        }
    }
}
