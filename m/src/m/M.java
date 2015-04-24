/*
MeregeSort
 * */

package m;

/**
 *
 * @author mederbekbegmatov
 */
import java.util.Random;
import java.util.Scanner;
public class M {

    /**
     * @param args the command line arguments
     */
    //
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
        public void print()
        {
            for(int i=0;i<length;i++)
                System.out.print(a[i]+" ");
        }
        
        public void input(int j)
        {
            Random ran=new Random();
            for (int i=0;i<length;i++)
            {
                a[i]=ran.nextInt()%j;
            }
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        Ar a=new Ar(n);
        a.input(100);
        a.print();
    }
    
}
