/*
 Maximum difference between two elements such that 
larger element appears after the smaller number
 */

package array21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mederbekbegmatov
 */
public class Array21 {

    public static class Ar
    {
          int[] a;
        int length;
        public Ar(int n)
        {
            a= new int[n];
            length=n;
     
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
       
        public void print()
        {
            for (int i=0;i<length;i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
        public void Maxdiff()
        {
            int maxDif,min=a[0],i;
            
            if (length>1)
                maxDif=a[1]-a[0];
            else
                maxDif=0;
            for (i=1;i<length;i++)
            {
                if (a[i]-min>maxDif)
                    maxDif=a[i]-min;
                if (a[i]<min)
                    min=a[i];
            }
            System.out.println(maxDif);
        }
     
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        Ar a = new Ar(n);
        a.input();
        a.print();
        a.Maxdiff();
    }
    
}
