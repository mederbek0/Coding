/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack4;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author mederbekbegmatov
 */
public class Stack4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in=new Scanner(new File("input.txt"));
        Stack st =new Stack();
        String s=in.nextLine();
        int i=0;
        while(i<s.length()){
            if (s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if (s.charAt(i)==')' && !st.isEmpty())
                st.pop();
            else
                if (s.charAt(i)==')' && st.isEmpty())
                {
                    System.out.println("Not Balanced");
                    return;
                }
            i++;
                    
            
        
        }
        if (st.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
        
    }
    
}
