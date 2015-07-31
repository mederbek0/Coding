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
    public void print(Node k){
        Node first=k;
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
            if (fast.next.next!=null)
                first=first.next;
            
            fast=fast.next.next;
        }
        return first;
    }
    //mergesort data;
     public Node middle(Node k){
        Node first=k,fast=k;
        while(fast!=null && fast.next!=null)
        {
            if (fast.next.next!=null)
                first=first.next;
            
            fast=fast.next.next;
        }
        return first;
    }
    
    public Node rightHalf(Node k){
        Node j=middle(k).next;
        middle(k).next=null;
        return j;
    
    }
    
    public void sort(){
        head=Msort(head);
        
    }
    public Node merge(Node left, Node right){
        Node k;
        if (left==null || right==null)
        {
            if (left==null && right==null)
                return right;
            else if (left==null)
                return right;
            else
                return left;
        
        }
        
        if (left.data<right.data)
           {
               k=left;
               left=left.next;
           }
           else
           {
               k=right;
               right=right.next;
           }
        Node m=k;
        while (left!=null && right!=null)
        {
            if (left.data<right.data)
           {
               k.next=left;
               left=left.next;
           }
           else
           {
               k.next=right;
               right=right.next;
           }
            k=k.next;
           
        }
        
        while(left!=null){
            k.next=left;
            left=left.next;
            k=k.next;
        }
        while (right!=null)
        {
            k.next=right;
            right=right.next;
            k=k.next;
        }
    return m;
    
    }
    public Node Msort(Node k){
        
        if ((k!=null && k.next==null)||k==null)
            return k;
        Node right=Msort(rightHalf(k));
        Node left =Msort(k);
        Node m=merge(right,left);
       // print(m);
    return m;
    }
    
    
}
