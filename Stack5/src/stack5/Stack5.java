/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack5;
import java.util.*;
import java.io.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Stack5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in=new Scanner(new File("input.txt"));
        Stack<Integer> st=new Stack();
        Queue<Integer> qu=new LinkedList<Integer>();
        int i,current,peek;
        while(in.hasNext())
        {
            qu.add(in.nextInt());
        }
        st.push(qu.remove());
        while(!qu.isEmpty())
        {
            current=qu.remove();
            peek=st.pop();
            while(peek<current)
            {
                System.out.println(peek+" --> "+current);
                if (st.isEmpty())
                    break;
                peek=st.pop();
            }
            if (peek>=current)
                st.push(peek);
            st.push(current);
        }
        while(!st.isEmpty())
        {
            System.out.println(st.pop()+ " --> -1");
        }
    }
    
}
