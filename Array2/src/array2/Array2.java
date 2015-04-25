/*
 * Majority Element: A majority element in an array A[] of size n is an element that appears more 
than n/2 times (and hence there is at most one such element).
Write a function which takes an array and emits the majority element (if it exists),
otherwise prints NONE as follows:


 */

package array2;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Array2 {
    public static class Ar{
        int[] a;
        int length;
        public Ar(int n)
        {
            length=n;
            a=new int[n];
        }
         public void input(int n)
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
        public int searchMax()
        {
           int maxIndex=0,count=1;
           for (int i=0;i<length;i++)
           {
               if (a[maxIndex]==a[i])
                   count++;
               else
                   count--;
               if (count==0)
               {
                   maxIndex=i;
                   count=1;
               }
           }
           return a[maxIndex];
        }
        public void isMax()
        {
            int count=0;
            int k=searchMax();
            for(int i=0;i<length;i++)
                if (a[i]==k)
                    count++;
            if (count>length/2)
                System.out.println(k);
            else
                System.out.println("None");
        }
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a=new Ar(n);
        a.input(n);
        a.print();
        System.out.println();
        a.isMax();
    }
    
}
