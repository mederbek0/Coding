/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package llist3;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author mederbekbegmatov
 */
public class LList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner in =new Scanner(new File("input.txt"));
        LinkedList list=new LinkedList();
        while(in.hasNext())
        {
            list.addNodeToEnd(new Node(in.nextInt()));
        }
        list.print();
        Node a=new Node(4);
        Node b=new Node(3);
        list.addNode(a);
        list.addNodeToEnd(b);
        list.print();
        list.remove(b);
        list.print();
       // list.segregate();
        list.print();
        list.RightGreat();
        list.print();
    }
    
}
