/*
 An element in a sorted array can be found in O(log n) time via binary search. But 
suppose I rotate the sorted array at some pivot unknown to you beforehand. So for 
instance, 1 2 3 4 5 might become 
3 4 5 1 2. Devise a way to find an element in the rotated array in O(log n) time.
 */

package array6;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array6 {

    /**
     * @param args the command line arguments
     */
     public static class Ar
    {
        int[] a,b;
        int length;
        public Ar(int n)
        {
            a=new int[n];
            b=new int[n];
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
        public void findPivot()
        {
            int mid,left=0,right=length-1;
            while (true)
            {
                mid=(left+right+1)/2;
                if (mid>0)
                 if (a[mid-1]>a[mid])
                 {
                    System.out.println(mid+" value = "+a[mid]);
                    break;
                 }
                
                if (a[mid]<=a[left])
                {
                    right=mid;
                }
                else
                {
                    left=mid;
                }
                if (mid==length-1 && a[mid-1]<=a[mid])
                {
                    System.out.println(0+" value= "+a[0]);
                    break;
                }    
                
            }
                
        }
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        Ar a=new Ar(n);
        a.input();
        a.findPivot();
    }
    
}
