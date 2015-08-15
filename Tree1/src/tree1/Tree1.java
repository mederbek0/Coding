/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree1;
import java.util.*;
import java.io.*;
/**
 *
 * @author mederbekbegmatov
 */
public class Tree1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner in=new Scanner(new File("input.txt"));
        Tree tr=new Tree();
        Tree tr1=new Tree();
        // System.out.println("1");
        tr.root=new Node(1);
        tr1.root=new Node(1);
        tr.root.right=new Node(4);
        tr1.root.right=new Node(4);
        tr.root.left= new Node(3);
        tr1.root.left= new Node(3);
        tr.root.left.right= new Node(5);
        tr1.root.left.right= new Node(5);
        tr.root.left.left= new Node(2);
        tr1.root.left.left= new Node(2);
        
        tr.traverse(tr.root);
     //  System.out.println(tr.root.data);
       
        System.out.println(tr.sizeOf(tr.root));
    }
    
    
    
}
