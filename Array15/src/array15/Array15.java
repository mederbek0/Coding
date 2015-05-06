/*
 Inversion Count for an array indicates – how far (or close) the array is from being sorted. 
If array is already sorted then inversion count is 0. If array is sorted in reverse order that 
inversion count is the maximum. 
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
 */

package array15;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array15 {

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
        public int mergeSort(int left,int right)
        {
            int count=0,mid;
            if(left<right)
            {
                mid=(left+right)/2;
                count=mergeSort(left,mid);
                count+=mergeSort(mid+1,right);
                count+=merge(left,mid+1,right);
            }
            return count;
        }
        public int merge(int left,int mid, int right)
        {
            for (int i=left;i<=right;i++)
                b[i]=a[i];
            int i=left,j=mid,k,count=0;
            k=i;
            
            while(i<mid && j<=right)
            {
                if (b[i]<=b[j])
                    a[k++]=b[i++];
                else
                {
                    a[k++]=b[j++];
                    count+=mid-i;
                }
                    
            }
            while (i<mid)
                a[k++]=b[i++];
            while(j<=right)
                a[k++]=b[j++];
            return count;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        System.out.println(a.mergeSort(0, n-1));
    }
    
}
