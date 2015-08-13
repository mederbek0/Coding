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
public class Node {
    Node right;
    Node left;
    int data;
    public Node(int k)
    {
        this.data=k;
        this.right=null;
        this.left=null;
    }
    
}
