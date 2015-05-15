/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array23;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */

        
        

    
public class Array23 {

    /**
     * @param args the command line arguments
     */
    public static class Ar
    {
          int[] a;
        int length;

        public Ar(int n,int m)
        {
            a= new int[n];
            length=n;
       
        }
         public void input()
        {
       Scanner in=new Scanner(System.in);
        for (int i=0;i<length;i++)
            a[i]=(in.nextInt());
     
        }
         
       
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        public void findNumbers(int k)
        {
            boolean yes=false;
            int mid=length/2;
            int left=0,right=length-1;
            while (left<right)
            {
               
                mid=(left+right)/2;
                if (k==a[mid])
                {
                    System.out.println(mid);
                    yes=true;
                    break;
                    
                }
                   else if (k>a[mid])
                {
                    left=mid+1;
                }
                else
                    right=mid-1;
            }
      
            if (yes)
                System.out.println("floor= "+a[mid]+" ceiling= "+a[mid]);
            else
            {
                while (left>=0)
                {
                    if (a[left]<k)
                    {
                        System.out.println("floor = "+a[left]);
                        break;
                    }
                    else
                    {
                     left--;       
                    }
                    if (left<0)
                        System.out.println("No floor");
                }
                while(right<length)
                {
                    
                    if (a[right]>k)
                    {
                        System.out.println(" ceiling = "+a[right]);
                        break;
                    }
                    else
                    {
                        right++;
                    }
                    if (right>=length)
                    {
                        System.out.println("No ceiling");
                    }
                }
            }
            
        }

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        Ar a = new Ar(n,m);
        a.input();
        a.print();
        a.findNumbers(m);
    }
    
}
