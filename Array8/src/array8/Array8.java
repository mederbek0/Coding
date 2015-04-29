/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array8;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class Array8 {

    /**
     * @param args the command line arguments
     */
    public static class Ar
    {
        int[] a,b;
        int length;
        public Ar(int n)
        {
            length=n;
            a=new int[n];
            b=new int[n];
        }
        public void input()
        {
            Scanner in= new Scanner(System.in);
            for (int i=0;i<length;i++)
                a[i]=in.nextInt();
            for (int i=0;i<length;i++)
                b[i]=in.nextInt();
        }
        public int max(int a, int b)
        {
            if (a>b)
                return a;
            else
                return b;
        }
         public int min(int a, int b)
        {
            if (a>b)
                return b;
            else
                return a;
        }
        public int middle(int[] a,int left, int right)
        {
            int mid=(right+left)/2;
            if ((right-left)%2==0)
                return (a[mid]);
            else
                return ((a[mid]+a[mid+1])/2);
                        
        }
        public void median(int aleft, int aright, int bleft, int bright)
        {
            System.out.println(aleft+" aright= "+aright+" bleft= "+bleft+" bright= "+bright);
            if (aright-aleft==1 && bright-bleft==1)
            {
                System.out.println((max(a[aleft],b[bleft])+min(a[aright],b[bright]))/2);
                return ;
            }
            if (middle(a,aleft,aright)<middle(b,bleft,bright))
            {
                if ((aright-aleft)%2!=0)
                    median((aleft+aright)/2+1,aright,bleft,(bleft+bright)/2);
                else
                    median((aleft+aright)/2,aright,bleft,(bleft+bright)/2);
            }
            else
                {
                if ((aright-aleft)%2!=0)
                    median(aleft,(aleft+aright)/2,(bleft+bright)/2+1,bright);
                else
                    median(aleft,(aleft+aright)/2,(bleft+bright)/2,bright);
                }   
            
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    Ar a=new Ar(n);
    a.input();
    a.median(0, n-1, 0, n-1);
    }
    
}
