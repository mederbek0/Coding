/*
 Print the elements of an array in the decreasing frequency if 
2 numbers have same frequency then print the one which came 1st
E.g. 2 5 2 8 5 6 8 8 output: 8 8 8 2 2 5 5 6.
 */

package array14;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array14 {

     public static class Ar
    {
        int[] a;
        int length;
        public Ar(int n)
        {
            a= new int[n];
            length=n;
        }
         public void input()
        {
        Random ran=new Random();
        for (int i=0;i<length;i++)
            a[i]=abs(ran.nextInt()%10);
        }
         
         public int abs(int b)
         {
             if (b>0)
                 return b;
             else 
                 return b*(-1);
                         
         }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
    }
    
}
