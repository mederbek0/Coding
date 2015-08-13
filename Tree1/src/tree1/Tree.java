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
        boolean yes=false;
        if (root==null)
            root=k;
        Node current=root;
        while(current!=null && !yes)
        {
            System.out.println(current.data+" "+k.data);
            if (current.data>k.data)
            {
                if (current.right!=null)
                {
                    current=current.right;
                }
                else
                {
                    current.right=k;
                    current=current.right;
                    yes=true;
                    //break;
                    
                }
            }
            else
            {
                if (current.left!=null)
                { current=current.left;
                }
                else
                {
                    System.out.println("null");
                    current.left=k;
                    current=current.left;
                    yes=true;
                    //break;
                }
            }
            
        }
    }
    
    public void traverse(Node head)
    {
        if (head==null)
            return;
        traverse(head.left);
        System.out.println(head.data+" ");
        traverse(head.right);
        
    }
    
}
