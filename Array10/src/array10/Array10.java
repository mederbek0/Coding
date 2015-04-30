/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array10;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Array10 {

    /**
     * @param args the command line arguments
     */
    public static class Ar
    {
        int[] a;
        int length;
        public Ar(int n)
        {
            a=new int[n];
            length=n;
        }
         public void input()
        {
        Random ran=new Random();
        for (int i=0;i<length;i++)
            a[i]=ran.nextInt()%100;
        }
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        public int gcd(int a,int b)
        {
            if (b==0)
                return a;
            else
                return gcd(b,a%b);
            
        }
//        public void rotate(int k)
//        {
//            
//            for(int i=0;i<k;i++)
//                
//        }
//        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        Ar a=new Ar(n);
        a.input();
        a.print();
        System.out.println(a.gcd(12,9));
        
    }
    
}
