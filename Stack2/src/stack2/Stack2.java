/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack2;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author mederbekbegmatov
 */
public class Stack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in=new Scanner(new File("input.txt"));
        Stack st=new Stack();
        String s="";
        int i;
        while(in.hasNextLine()){
            s=in.nextLine();
        }
        for(i=0;i<s.length();i++)
        {
            if (isOperand(s.charAt(i))){
                System.out.print(s.charAt(i));
            }else
            {
                if (st.isEmpty()|| s.charAt(i)=='(')
                {
                    st.push(s.charAt(i));
                }else if (s.charAt(i)==')')
                {
                    while(st.peek()!='(' && !st.isEmpty())
                        System.out.print(st.pop());
                    if(st.peek()=='(')
                       st.pop();
                }else if (s.charAt(i)=='+' || s.charAt(i)=='-'){
                    while(st.peek()=='/' ||st.peek()=='^'||st.peek()=='*' )
                    {
                        System.out.print(st.pop());
                    }
                    st.push(s.charAt(i));
                }else 
                {
                    st.push(s.charAt(i));
                }
            } 
        }
        while(!st.isEmpty())
            System.out.print(st.pop());
    }
    
    public static boolean isOperand(char a){
        if (a=='/' || a=='*' ||a=='-' ||a=='+' || a=='^' || a=='(' ||a==')')
            return false;
        return true;
    }
    
    public static boolean compare(char a, char b){
        if ((a=='+' || a=='-')&&(b=='*' ||b=='/'))
            return true;
        return false;
    
    }
    
    
    
}
