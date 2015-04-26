/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array5;

import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array5 {
    
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
        public int missingNumber()
        {
            int sum=(length+1)*(length+2)/2;
            int sumNumbers=0;
            if (length!=a[length-1])
            {
                for (int i=0;i<length;i++)
                    sumNumbers=sumNumbers+a[i];
                return sum-sumNumbers;
            }
            return length+1;
        }
     }
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       Ar a=new Ar(n);
       a.input();
       System.out.println(a.missingNumber());
       
    }
    
}
