/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack2;

/**
 *
 * @author mederbekbegmatov
 */
public class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    
    
    public void addNode(Node a){
        if (head==null)
        {
            head=a;
        }
        else
        {
            a.next=head;
            this.head=a;
        }
    
    }
    
    public void print(){
        Node first=head;
        while(first!=null)
        {
            System.out.print(first.data+" ");
            first=first.next;
        }
    
    }
    
    public Node remove(){
        Node first=head;
        head=head.next;
        return first;
    }
    
    
    public Node head(){
        
        return head;
    }
    
    
}
