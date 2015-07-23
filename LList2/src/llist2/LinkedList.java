/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package llist2;

/**
 *
 * @author mederbekbegmatov
 */
public class LinkedList {
    Node head;
    public LinkedList(){
    this.head=null;
    }
    //adding Node to head;
    public void add(Node k){
        if (this.head==null){
            this.head=k;
        }
        else
        {
            k.next=head;
            head=k;
        }
        
    }
    //method to print whole list
    public void print(){
        Node first=this.head;
        while(first!=null)
        {
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println();
    }
    
    //method to reverse whole list
    
    public void reverse(){
        Node first=this.head;
        Node next,prev=null;
        while(first!=null)
        {
            
            next=first.next;
            first.next=prev;
            prev=first;
            first=next;
        }
        this.head=prev;
    
    }
    
}
