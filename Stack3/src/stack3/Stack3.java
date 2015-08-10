/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack3;
import java.util.*;

import java.io.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Stack3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in =new Scanner(new File("input.txt"));
        String s=in.nextLine();
        Stack<Integer> st=new Stack();
        Stack op=new Stack();
        char ch;
        int i;
        while(s.length()>0)
        {
            
            if (isOperand(s.charAt(0)))
            {
                st.push(operation(s.charAt(0),st.pop(),st.pop()));
                if (s.length()>1)
                    s=s.substring(2,s.length());
                else
                    s="";
            }    
            else
            {
                if (nextOperator(s)>-1)
                {
                    st.push(nextOperand(s,nextOperator(s)));
                    s=s.substring(nextOperator(s)+1,s.length());
                }
                else
                    s="";
            }
            
        }
         System.out.print(st.pop());
        
    }
   public static int operation(char ch, int a, int b){
       switch (ch){
           case '+':return b+a;
           case '-':return b-a;
           case '*':return b*a;
           case '/':return b/a;
           case '^':return pow(b,a);    
   }
       return -1;
   }
           
   public static int pow(int a, int b){
   int mult=1,i=0;
   
   while(i<b){
       mult*=a;
   
   }
   return mult;
   }
           
           
           
           
   public static int nextOperand(String s,int i)
   {
       String s1=s.substring(0,i);
       return Integer.parseInt(s1);
   }
   public static boolean isOperand(char ch)
   {
       if (ch=='*' || ch=='/' || ch=='+' || ch=='-' || ch=='^')
           return true;
       else
           return false;
   }
   
   public static int nextOperator(String s)
   {
       int i=0;
       while(i<s.length())
       {
           if (s.charAt(i)==' ')
               return i;
           i++;
       }
    return -1;   
   }
}
