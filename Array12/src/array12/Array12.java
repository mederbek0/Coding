/*
Given an array of positive numbers, find the maximum sum of a 
subsequence with the constraint that no 2 numbers in the sequence should be adjacent 
in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 
should return 15 (sum of 3, 5 and 7).Answer the question in most efficient way.
 */

package array12;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author mederbekbegmatov
 */
public class Array12 {

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
        public int maxSum()
        {
            int prevMax=0;
            int sumMax=a[0];
            int max1;
            for(int i=1;i<length;i++)
            {
                if (sumMax>prevMax)
                    max1=sumMax;
                else
                    max1=prevMax;
                
                
                
                sumMax=prevMax+a[i];
                prevMax=max1;
                
            }
            
            if (sumMax>prevMax)
                    return sumMax;
                else
                    return prevMax;
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        System.out.println(a.maxSum());
    }
    
}
