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
                System.out.print(first.next.data+" ");
                first=first.next;
            }
            System.out.println();
        }
        public void pushToEnd(int n)
        {
            Node first=header;
           while(first.next!=null)
           {
               first=first.next;
           }
           first.next=new Node(n);
        }
        public void DeleteNode(int n)
        {
            Node first=header;
            Node prev=header;
            while(first.next!=null)
            {
                prev=first;
                first=first.next;
                if (first.data==n) break;
            }
            if (first.data==n)
            {
                
                prev.next=first.next;
            }
            else
            {
                System.out.println("Couldn't find Node");
            }
        }
        public int length()
        {
            Node first=header;
            int count=0;
            while(first.next!=null)
            {
                count++;
                first=first.next;
            }
            
            return count;
        }
        public int Nth(int count)
        {
            Node first=header;
            int num=-1;
            boolean yes=false;
            while(first.next!=null)
            {
                first=first.next;
                if (count==0)
                {
                    num=first.data;
                    yes=true;
                }
                count--;
                
            }
            
            return num; 
        }
        public int middle()
        {
            Node first=header,second=header;
            while(second!=null)
            {
                first=first.next;
                if (second.next!=null)
                    second=second.next.next;
                else
                    second=second.next;
            }
            return first.data;
        }
        public int NthfromEnd(int n)
        {
            int counter=0;
            Node first=header,second=header;
            while(counter<n)
            {
                if (second==null)
                {
                    System.out.println("The linked list shorter than entered number");
                    return -1;
                }
                else
                {
                    second=second.next;
                    counter++;
                }
            }
            while (second!=null)
            {
                first=first.next;
                second=second.next;
            }
            return first.data;
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
        a.push(20);
        a.push(12);
        a.push(0);
        a.pushToEnd(10);
        a.pushToEnd(11);
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.DeleteNode(10);
        a.traverse();
        System.out.println(a.length());
        System.out.println(a.Nth(3));
        System.out.println(a.middle());
        System.out.println(a.NthfromEnd(4));
        
        
    }
    
}
