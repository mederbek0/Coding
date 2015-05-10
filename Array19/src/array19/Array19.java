/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array19 {

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
            a[i]=(ran.nextInt()%100);
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
     
       public void findMinAndMax()
       {
           int min1,max1,i,k,l;
           if (length%2==0)
           {
               
                   min1=min(a[0],a[1]);
                   max1=max(a[0],a[1]);
                   i=2;
               
           }
           else
           {
               min1=a[0];
               max1=a[1];
               i=1;
           }
           
           for (int j=i;j<length;j+=2)
           {
               if (a[j]<a[j+1])
               {
                   if (min1>a[j])
                       min1=a[j];
                   if (max1<a[j+1])
                       max1=a[j+1];        
               }
               else
                {
                   if (min1>a[j+1])
                       min1=a[j+1];
                   if (max1<a[j])
                       max1=a[j];        
               }   
               
           }
           System.out.println("Minimum = "+min1+" maximum = "+max1);
       }
       public int min(int l,int k)
       {
           if (l<k)
               return l;
           else
               return k;
       }
       public int max(int l, int k)
       {
           if (l>k)
               return l;
           else
               return k;
       }
    }
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.findMinAndMax();
    }
    
}
