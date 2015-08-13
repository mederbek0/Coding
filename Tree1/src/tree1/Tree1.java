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
       // System.out.println("1");
        int k;
        while(in.hasNext())
        {
            k=in.nextInt();
            tr.add(new Node(k));
        
        }
        tr.traverse(tr.root);
    }
    
}
