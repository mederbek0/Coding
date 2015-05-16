/*
You are given an array of n+2 elements. All elements of the array are in range 1 to n. 
And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
 */

package array26;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array26 {

    /**
     * @param args the command line arguments
     */
    public static class Ar
    {
          int[] a,b;
        int length;
        public Ar(int n)
        {
            a= new int[n];
            b=new int[n];
            length=n;
            for (int i=0;i<n-2;i++)
                b[i]=0;
     
        }
         public void input()
        {
            Scanner in =new Scanner(System.in);
            for (int i=0;i<length;i++)
            a[i]=(in.nextInt()%100);
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
        public void repeatedNumbers()
        {
            for (int i=0;i<length;i++)
                if (b[a[i]]==1)
                    System.out.println(a[i]);
                else
                    b[a[i]]++;
        }
        
     
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.repeatedNumbers();
    }
    
}
