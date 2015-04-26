/*
 * Largest Sum Contiguous Subarray
Write an efficient C program to find the sum of contiguous subarray within a
one-dimensional array of numbers which has the largest sum.


 */

package arrays4;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Arrays4 {

    /**
     * @param args the command line arguments
     */
     public static class Ar
    {
        int[] a,b;
        int length;
        public Ar(int n)
        {
            a=new int[n];
            b=new int[n];
            length=n;
        }
          public void input()
        {
            //Random rand=new Random();
            Scanner in=new Scanner(System.in);
            for(int i=0;i<length;i++)
            {
                a[i]=in.nextInt();
            }
        }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
        }
        //
       public int maxSum()
       {
           int sum=0;
           b[0]=a[0];
           for (int i=1;i<length;i++)
               if (a[i]<(b[i-1]+a[i]))
                   b[i]=b[i-1]+a[i];
                else
                b[i]=a[i];
           int imax=-1000000;
           for (int i=0;i<length;i++)
              if (imax<b[i])
                  imax=b[i];
       return imax;   
       }
       public int maxSum1()
       {
           int maxSum=a[0],currentMax=maxSum;
           for (int i=1;i<length;i++)
           {
               if (currentMax+a[i]>a[i])
               {
                   currentMax+=a[i];
               }
               else
               {
                   currentMax=a[i];
               }
               maxSum=max(currentMax,maxSum);
           }
           return maxSum;
       }
       public int max(int a, int b)
       {
           if (a>b)
               return a;
           else
               return b;
       }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner in = new Scanner(System.in);
     int n=in.nextInt();
     Ar a= new Ar(n);
     a.input();
     a.print();
     System.out.println(a.maxSum());
     System.out.println(a.maxSum1());
        
    }
    
}
