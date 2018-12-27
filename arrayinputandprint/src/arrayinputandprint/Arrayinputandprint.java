/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinputandprint;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Arrayinputandprint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String a[]=new String[5];
Scanner in =new Scanner(System.in);

printclass hassam=new printclass();
for(int i=0;i<=4;i++)
    {
       System.out.println("Enter your Friend's name"+(i+1));
      a[i]=in.nextLine();
 
    }
hassam.check(a);     // TODO code application logic here
    }
    
}
