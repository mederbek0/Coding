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
        
        //MeregeSort function
        public void msort(int left,int right)
        {
            if (left<right)
            {
                int mid=(left+right)/2;
                
                msort(left,mid);
                msort(mid+1,right);
                merge(left,mid,right);
            }
        }
        public void merge(int left, int mid,int right)
        {
            for (int i=left;i<=right;i++)
                b[i]=a[i];
            int i=left;
            int j=left,k=mid+1;
            while (j<=mid && k<=right)
            {
                if (b[j]<=b[k])
                {
                  
                    a[i]=b[j];
                    j++;
                  
                }
                else
                {
                    a[i]=b[k];
                    k++;
                }       
                i++;
                
            }
            while (k<=right)
            {
                a[i]=b[k];
                i++;k++;
            }
            while (j<=mid)
            {
                a[i]=b[j];
                i++;j++;
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
        a.msort(0,n-1);
        System.out.println();
        a.print();
    }
    
}
