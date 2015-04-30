/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array9;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mederbekbegmatov
 */
public class Array9 {
    
    /**
     * @param args the command line arguments
     */
    public static class Ar{
    int[] a;
    int length;
    public Ar(int n)
    {
        a = new int[n];
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
    public void swap(int i,int b)
    {
        int temp=a[i];
        a[i]=a[b];
        a[b]=temp;
    }
    public void reverse()
    {
        for(int i=0;i<length/2;i++)
            swap(i,length-i-1);
    }
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.reverse();    
        a.print();
    }
    
}
