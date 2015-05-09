/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array18;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array18 {

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
            a[i]=abs(ran.nextInt()%4);
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
        public void findMost()
        {
            int half=length/2+1,m=a[length/2], index=binarySearch(0,length-1,a[length/2]);
            
            
            if (index+half<length) 
            {
                if (a[index+half]==m)
                    System.out.println("Most numbers are= "+m);
                else
                    System.out.println("There is no majority");
            }
            else
            System.out.println("no majority");
        }
        public int binarySearch(int left,int right, int num)
        {
            int mid=(left+right)/2;
            while (true)
            {
                mid=(left+right)/2;
                if ((mid==0 || mid==right)&&(left==right))
                    if (mid==0)
                        return -1;
                    else
                        return mid;
                if (a[mid]<num && mid<right)
                    if (a[mid+1]==num)
                        return mid;
                if (a[mid]>=num)
                    right=mid;
                else
                    left=mid;
                
                    
                
            }
            
            
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
        a.findMost();
    }
    
}
