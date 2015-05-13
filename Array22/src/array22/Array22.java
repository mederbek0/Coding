/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array22;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array22 {

    /**
     * @param args the command line arguments
     */
        public static class Ar
    {
          int[] a,b;
        int length;
        int length2;
        public Ar(int n,int m)
        {
            a= new int[n];
            length=n;
            b=new int[m];
            length2=m;
        }
         public void input()
        {
       Scanner in=new Scanner(System.in);
        for (int i=0;i<length;i++)
            a[i]=(in.nextInt());
        for (int j=0;j<length2;j++)
            b[j]=in.nextInt();
        }
         
       
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        public void printUnion()
        {
            int i=0,j=0;
            while (i<length && j<length2)
            {
                if (a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    i++;
                    j++;
                }
                else if(a[i]<b[j])
                {
                    System.out.print(a[i]+" ");
                    i++;
                }
                else
                {
                    System.out.print(b[j]+" ");
                    j++;
                }
                    
            }
            while (i<length)
            {
                System.out.print(a[i]+" ");
                i++;
            }
            while (j<length2)
            {
                System.out.print(b[j]+" ");
                j++;
            }
            
        }
        public void printIntersection()
        {
            int i=0,j=0;
            while (i<length && j<length2)
            {
                if (a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    i++;j++;
                }
                else if (a[i]<b[j])
                {
                    i++;
                }
                else
                {
                    j++;
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
        a.printUnion();
        System.out.println();
        a.printIntersection();
    }
    
}
