/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Hello {  
 public static void main(String args[]) {  
  Scanner in = new Scanner(System.in);
  int n=in.nextInt();
  int count=0;
  for(int i=1;i<=n;i++)
  {
    String r=String.valueOf(i);
    char c[]=r.toCharArray();
    for(Character q:c)
    {
        if(q=='1')
        {
            count++;
        }
    }
  }
  System.out.print(count);
 }  
}