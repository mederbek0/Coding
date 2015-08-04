/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package llist3;

/**
 *
 * @author mederbekbegmatov
 */
public class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    //
    public void addNode(Node a){
        if (this.head==null) 
            this.head=a;
        else
        {
            a.next=this.head;
            this.head=a;
        }
    
    }
    //
    public void addNodeToEnd(Node a){
        Node first=this.head;
        if(head==null){
            head=a;
        }
        else
        {
            while(first.next!=null)
            {
                first=first.next;
            }
            first.next=a;
        }
    
    }
    //
    public void remove(Node k){
        Node first=this.head;
        Node prev=null;
        while (first!=k){
            prev=first;
            first=first.next;
        }
        if (prev==null){
           head=head.next; 
        }else
        {
            if (first==k)
            {
                prev.next=first.next;
            }
            else
            {
                System.out.println("couldn't find Node");
            }
        }
    }
    
    //
    
    public void segregate(){
        Node first=this.head;
        Node prev=null;
        Node prev1=null;
        Node temp=null;
        while(first!=null){
            if (first.data%2==1)
            {
                temp=first;
                first=first.next;
                remove(temp);
                if(prev==null){
                    temp.next=null;
                    prev=temp;
                    prev1=temp;
                }else
                {
                    temp.next=null;
                    prev.next=temp;
                    
                    prev=prev.next;
                }
               // System.out.print(temp.data+" + ");
            }
            else
            {
                first=first.next;
            }
        
        }
        first=head;
        prev=null;
        while(first!=null){
            prev=first;
            first=first.next;}
        prev.next=prev1;
        
        
    }
    
    //
    public void reverse(){
        Node first=this.head;
        Node prev=null;
        while(first!=null){
            Node temp=first.next;
            first.next=prev;
            prev=first;
            first=temp;
        }
        this.head=prev;
    }
    //
    
    public void RightGreat(){
        reverse();
        Node first=this.head;
        int min=this.head.data;
        int max=this.head.data;
        while(first!=null){
            if (first.data>=max)
            {
                max=first.data;
            }
            else
            {
                remove(first);
            }
            first=first.next;
        
        
        }
        reverse();
    }
    //
    public void print(){
        Node first=this.head;
        while(first!=null){
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.println(); 
    }
    
    
    
}
