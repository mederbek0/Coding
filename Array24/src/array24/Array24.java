/*
 Given an array arr[] of n integers, construct a Product Array prod[] 
(of same size) such that prod[i] is equal to the product of all the elements 
of arr[] except arr[i]. Solve it without division operator and in O(n).
 */

package array24;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array24 {

    /**
     * @param args the command line arguments
     */
    public static class Ar
    {
          int[] a,b,temp;
        int length;

        public Ar(int n)
        {
            a= new int[n];
            length=n;
            b=new int[n];
            temp=new int[n];
        }
         public void input()
        {
       Scanner in=new Scanner(System.in);
        for (int i=0;i<length;i++)
            a[i]=(in.nextInt());
     
        }
         
       
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
            for (int i=0;i<length;i++)
                System.out.print(b[i]+" ");
            
        }
       public void prod()
       {
           int prod=1;
           for (int i=0;i<length;i++)
           {
               b[i]=prod;
               prod*=a[i];
           }
           prod=1;
           for (int i=length-1;i>=0;i--)
           {
               temp[i]=prod;
               prod*=a[i];
           }
           for (int i=0;i<length;i++)
           {
               b[i]=b[i]*temp[i];
           }
       }
            
        

    }
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.prod();
        a.print();
    }
    
}
