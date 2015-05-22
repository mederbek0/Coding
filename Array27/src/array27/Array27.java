/*
 Given an array A[] consisting 0s, 1s and 2s, write 
a function that sorts A[]. The functions should put all 0s first, 
then all 1s and all 2s in last.

not FInsihed.
 */

package array27;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array27 {

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
            b=new int[n];
            length=n;
            for (int i=0;i<n-2;i++)
                b[i]=0;
     
        }
         public void input()
        {
            Scanner in =new Scanner(System.in);
            for (int i=0;i<length;i++)
            a[i]=(in.nextInt()%100);
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
        public void swap(int k,int l)
        {
            int temp=a[k];
            a[k]=a[l];
            a[l]=temp;
        }
        public void sort()
        {
            int low=0,mid=0,high=length-1;
            while(mid<=high)
            {
                switch (a[mid])
                {
                    case 0:{swap(low++,mid++);break;}
                    case 1:{mid++;break;}
                    case 2:{swap(mid,high--);break;}
                }
                
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
        a.sort();
        a.print();
    }
    
}
