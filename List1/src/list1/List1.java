/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list1;
import java.util.Scanner;
/**
 *
 * @author mederbekbegmatov
 */
public class List1 {

    /**
     * @param args the command line arguments
     */
    public static class Node
    {
        int data;
        Node next;
        public Node(int n)
        {
            data=n;
            next=null;
        }
    }
    public  static class LinkedList{
        Node header;
        public LinkedList()
        {
            header=new Node(1);
        }
        public void push(int n)
        {
            Node k=new Node(n);
            k.next=header.next;
            header.next=k;
        }
        public int pop()
        {
            int j=header.next.data;
            header.next=header.next.next;
            return j;
            
        }
        public void traverse()
        {
            Node first =header;
            while (first.next!=null)
            {
                System.out.println(first.next.data);
                first=first.next;
            }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        LinkedList a= new LinkedList();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(5);
        a.push(6);
        a.push(7);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.traverse();
        
        
    }
    
}
