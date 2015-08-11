/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Queue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       Scanner in=new Scanner(new File("input.txt"));
       Queue qu=new Queue();
       while(in.hasNext())
       {
           qu.enqueue(new Node(in.nextInt()));
       }
       System.out.println(qu.dequeue());    
       System.out.println(qu.peek());
       System.out.println(qu.dequeue());
       System.out.println(qu.peek());
    }
    
}
