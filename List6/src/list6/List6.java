/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.LinkedList;
package list6;

/**
 *
 * @author mederbekbegmatov
 */

public class List6 {

    /**
     * @param args the command line arguments
     */
    public static class LinkedList{
    
        Node head;
        public LinkedList(){
        this.head=new Node(-1);
        }
        public void sort(Node head){
            if (head.next==null || head.next.next==null)
                return;
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            Node newHead=slow.next;
            slow.next=null;
            
            sort(head);
            
        
        }
        
    }
    
    public static class Node{
        Node next;
        int data;
        public Node(int a){
           this.data=a;
           this.next=null;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
