/*
 There are two sorted arrays. First one is of size m+n containing only m elements. 
Another one is of size n and contains n elements. Merge these two arrays into the 
first array of size m+n such that the output is sorted.
 */

package array7;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Array7 {

    /**
     * @param args the command line arguments
     */
    public static void print(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static int[] move(int[] b)
    {
        int n=b.length;
        int i=n-1,j=n;
        while (i>=0 && j>=0){
            while (i>=0 && b[i]!=-1)
                i--;
            if(i<=j)
                j=i-1;
            while (j>=0 && b[j]==-1)
                j--;
            if(i>=0 && j>=0)
            {
                b[i]=b[j];
                b[j]=-1;
            }

        }
     return b;
    }
    public static int[] merge(int[] a,int[] b)
    {
        b=move(b);
        int m=b.length;
        int n=a.length;
        int j=n,i=0,k=0;
        while (k<m && i<n && j<m)
        {
            if (a[i]<=b[j])
            {
                b[k]=a[i];
                k++;
                i++;
            }
            else
            {
                b[k]=b[j];
                k++;
                j++;
            }    
            
        }
        while (i<n)
        {
            b[k]=a[i];
            k++;
            i++;
        }
                
                
        
        return b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //instead of NA value input -100
        Scanner in = new Scanner(System.in);
        int i,j,n,m;
        n=in.nextInt();
        m=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[n+m];
        System.out.println("Instead writing null type -100");
        for (i=0;i<n;i++)
            a[i]=in.nextInt();
        for (i=0;i<n+m;i++)
            b[i]=in.nextInt();
       // print(a);
       // System.out.println();
       // print(b);
        merge(a,b);
        
        System.out.println();
        
        print(b);
        
    }
    
}
