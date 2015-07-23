/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package llist2;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
/**
 *
 * @author mederbekbegmatov
 */
public class LList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner in=new Scanner(new File("input.txt"));
        LinkedList list=new LinkedList();
            while (in.hasNext()){
        
            list.add(new Node(in.nextInt()));
            }
            list.print();
            list.reverse();
            list.print();
            
       
    }
    
}
