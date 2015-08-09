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
        String s;
        while(in.hasNextLine()){
            s=in.nextLine();
            for(int i=0;i<s.length();i++)
            {
                st.push(s.charAt(i));
            }
        }
        st.print();
        st.pop();
        st.print();
    }
    
    
}
