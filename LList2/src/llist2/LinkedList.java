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
    //adding Node to the beginning;
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
    //adding Node to the end
    public void addToEnd(Node k){
        if (this.head==null)
        {
            this.head=k;
        }
        else
        {
            Node first=this.head;
            Node prev=null;
            while(first!=null)
            {
                prev=first;
                first=first.next;
            }
            prev.next=k;
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
    //middle element
    public Node middle(){
        Node first=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            first=first.next;
            fast=fast.next.next;
        }
        return first;
    }
    //mergesort data;
    public void sort(){
    
    
    
    }
    
    
}
