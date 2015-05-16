/*
Given an array A[], write a function that segregates even and odd numbers. 
The functions should put all even numbers first, and then odd numbers.
 */

package array25;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array25 {

    /**
     * @param args the command line arguments
     */
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
            a[i]=(ran.nextInt()%100);
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
        public void swap(int k,int l)
        {
            int temp=a[k];
            a[k]=a[l];
            a[l]=temp;
        }
        public void segregate()
        {
            int i=0,j=length-1;
            while (i<j)
            {
                while (a[i]%2==0)
                    i++;
                while (a[j]%2!=0)
                    j--;
                if (i<j)
                    swap(i,j);
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
        a.segregate();
        a.print();
    }
    
}
