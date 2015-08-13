/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tree1;

/**
 *
 * @author mederbekbegmatov
 */
public class Tree {
    Node root;
    public Tree()
    {
        this.root=null;
    }
    public void add(Node k)
    {
        root=putIn(root,k);
    }
    public Node putIn(Node current, Node element)
    {
        if(current==null)
            return current=element;
        
        if(current.data>element.data)
             current.right=putIn(current.right,element);
        else
            current.left=putIn(current.left,element);
      return current;  
    }
    
    public void traverse(Node head)
    {
        if (head==null)
            return;
       // System.out.println(head.data+" ");
        
        traverse(head.left);
        System.out.println(head.data+" ");
        traverse(head.right);
        //System.out.println(head.data+" ");
        
    }
    
}
