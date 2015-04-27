/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
