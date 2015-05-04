/*
Write a program to print all the LEADERS in the array. An element is 
leader if it is greater than all the elements to its right side. And the 
rightmost element is always a leader.
For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
 */

package array13;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array13 {
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
        public void leaders()
        {
            int i,max=a[length-1];
            System.out.print(a[length-1]+" ");
            if (length>2)
                for (i=length-2;i>=0;i--)
                {
                    if (a[i]>max)
                    {
                        max=a[i];
                        System.out.print(a[i]+" ");
                    }
                }
                
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
        a.leaders();
    }
    
}
