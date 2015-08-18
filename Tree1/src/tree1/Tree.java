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
    
    public int sizeOf(Node k)
    {
        if (k==null)
            return 0;
        else
            return (sizeOf(k.left)+1+sizeOf(k.right));
    }
    
    public int max(int a, int b)
    {
        if (a>b)
            return a;
        else 
            return b;
    }
    
    public int height()
    {
        return findHeight(this.root);
    }
    
    public int findHeight(Node k)
    {
        if (k==null)
            return 0;
        return 1+max(findHeight(k.left),findHeight(k.right));
            
    }
    
}
