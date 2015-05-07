/*
An Array of integers is given, both +ve and -ve. 
You need to find the two elements such that their sum is closest to zero.
 */

package array16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array16 {

    /**
     * @param args the command line arguments
     */ public static class Ar
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
          public void twoNumZero()
          {
              int i=0,j=length-1,minSum,sum,k=0,l=j;
              minSum=abs(a[j]+a[i]);
              while (minSum!=0 && i<j)
              {
                  if (a[j]+a[i]>0)
                  {
                      sum=a[j]+a[i];
                      if(abs(sum)<minSum)
                      {
                          minSum=abs(sum);
                          k=i;
                          l=j;
                          //System.out.println("SUM0= "+minSum+" left= "+k+"right"+l);
                      }
                      j--;
                  }
                  else
                  {
                      sum=a[j]+a[i];
                      if(abs(sum)<minSum)
                      {
                          minSum=abs(sum);
                          k=i;
                          l=j;
                          //System.out.println("SUM1= "+minSum+" left= "+k+"right"+l);
                      }
                      i++;
                  }   
              }
              System.out.println("SUM2= "+(a[l]+a[k])+" left= "+a[k]+"right"+a[l]);
              
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
        a.mergeSort(0, n-1);
        a.print();
        a.twoNumZero();
    }
    
}
