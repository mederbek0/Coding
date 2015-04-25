/*
 *Given an array A[] and a number x, check for pair in A[] with sum as x
Write a C program that, given an array A[] of n numbers and another number x,
determines whether or not there exist two elements in S whose sum is exactly x.
 */

package array1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Array1 {
    public static class Ar
    {
        int[] a,b;
        int length;
        public Ar(int n)
        {
            length=n;
            a=new int[n];
            b=new int[n];
        }
        public void input(int n)
        {
            Random rand=new Random();
            for(int i=0;i<length;i++)
            {
                a[i]=rand.nextInt()%n;
            }
        }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
        }
        //sort
        public void msort(int left,int right)
        {
            if (left<right)
            {
                int mid=(left+right)/2;
                msort(left,mid);
                msort(mid+1,right);
                merge(left,mid,right);
            }
        }
        public void merge(int left,int mid,int right)
        {
           for (int i=left;i<=right;i++)
               b[i]=a[i];
           
           
           int i=left,j=left,k=mid+1;
           while (j<=mid && k<=right)
           {
               if (b[j]<=b[k])
                   a[i++]=b[j++];
               else
                   a[i++]=b[k++];
           }
           while (j<=mid)
               a[i++]=b[j++];
           while (k<=right)
               a[i++]=b[k++];
           
           
        }
        public boolean isSumTwo(int k)
        {
            boolean yes=false;
            int i=0,j=length-1;
            while (true)
            {
                if (a[i]+a[j]>k)
                    j--;
                else if (a[i]+a[j]<k)
                    i++;
                else
                {
                    System.out.println(a[i]+" + "+a[j]);
                    return true;
                }
                    
               if (i==j)break; 
                
            }
            return false;
        }
        
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Ar a=new Ar(n);
        a.input(10);
        a.print();
        a.msort(0,n-1);
        System.out.println();
        a.print();
        int k=in.nextInt();
        if (a.isSumTwo(k)) System.out.println("True");
        else System.out.println("False");
    }
    
}
