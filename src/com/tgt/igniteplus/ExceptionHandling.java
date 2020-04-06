package com.tgt.igniteplus;
/*Use of try,catch and finally in Exception handling*/
public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3,4};
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block is executed by default");
        }
    }
}
/*OUTPUT:
java.lang.ArrayIndexOutOfBoundsException: 10
finally block is executed by default
 */

