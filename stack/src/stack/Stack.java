/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
/**
 *
 * @author mederbekbegmatov
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in =new Scanner(new File("input.txt"));
        arrayStack st=new arrayStack(5);
        int a;
        while(in.hasNext()){
           try{
               a=in.nextInt();
           }catch(InputMismatchException e){
               System.out.println("string "+ e.getMessage());
               a=-1;
               String s=in.nextLine();
           }
            st.push(a);
        
        }
        st.print();
        System.out.println(st.peek());
    }
    
}
