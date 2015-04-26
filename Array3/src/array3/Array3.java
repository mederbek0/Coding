/*
Find the Number Occurring Odd Number of Times
Given an array of positive integers. All numbers occur even number of times except one number which occurs 
odd number of times. Find the number in O(n) time & constant space.
 */

package array3;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array3 {
    public static class Ar
    {
        int[] a;
        int length;
        public Ar(int n)
        {
            a=new int[n];
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
        public int oddNumber()
        {
            int result=0;
            for (int i=0;i<length;i++)
            {
                result=result^a[i];
            //    System.out.print(result+" + ");
            }
            
            return result;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        Ar a=new Ar(n);
        a.input();
        a.print();
        System.out.println(a.oddNumber());
        
        
        
    }
    
}
