/*
Write an efficient C program to find smallest and second smallest element in an array.
 */

package array17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array17 {

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
            length=n;
            b=new int[n];
        }
         public void input()
        {
        Random ran=new Random();
        for (int i=0;i<length;i++)
            a[i]=ran.nextInt()%10;
        }
         
         public int abs(int b)
         {
             if (b>0)
                 return b;
             else 
                 return b*(-1);
                         
         }
         public void mergeSort(int left,int right)
         {
             int mid;
             if(left<right)
             {
                 mid=(right+left)/2;
                 mergeSort(left,mid);
                 mergeSort(mid+1,right);
                 merge(left,mid,right);
                 
                 
             }
         }
         public void smallesTwoNum()
         {
             int secondSmallest=-1,smallest=a[0];
             
             for (int i=1;i<length;i++)
             {
                 if (a[i]<smallest)
                 {
                     secondSmallest=smallest;
                     smallest=a[i];
                 }
             }
             System.out.println("Smallest= "+smallest+" Second smallest= "+secondSmallest);
         }
         
         public void merge(int left,int mid, int right)
         {
             for (int i=left;i<=right;i++)
                 b[i]=a[i];
             int i=left,k=left,j=mid+1;
             while(i<=mid && j<=right)
             {
                 if (b[i]<b[j])
                     a[k++]=b[i++];
                 else
                     a[k++]=b[j++];
             }
             while (i<=mid)
                 a[k++]=b[i++];
             while (j<=right)
                 a[k++]=b[j++];
         }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        
     }
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.smallesTwoNum();
    }
    
}
