/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


 import java.util.*;
class Hello1 {  
 public static void main(String args[]) {  
  Scanner in=new Scanner(System.in);
  System.out.println("Before swapping");  
  int x = in.nextInt();  
  int y = in.nextInt();  
  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);  
  System.out.println("After swapping");  
  x = x + y;  
  y = x - y;  
  x = x - y;  
  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);  
 }  
}