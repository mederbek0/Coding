/*
Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
 */

package array11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array11 {

    /**
     * @param args the command line arguments
     */
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
        Random ran=new Random();
        for (int i=0;i<length;i++)
            a[i]=ran.nextInt()%100;
        }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        public void swap (int i, int j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        public void reverse(int left, int right)
        {
            while (left<right)
            {
                swap(left,right);
                left++;
                right--;
                        
            }
        }
        public void rotate(int k)
        {
            reverse(0,k-1);
            reverse(k,length-1);
            reverse(0,length-1);
        }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        Ar a =new Ar(n);
        a.input();
        a.print();
        int k=in.nextInt();
        a.rotate(k);
        a.print();
        
        
    }
    
}
