/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package list5;
import java.util.Scanner;
import java.math.*;
/**
 *
 * @author mederbekbegmatov
 */
public class List5 {

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
            header=new Node(-11);
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
        public Node middle()
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
            return first;
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
        public void reverseList()
        {
            Node temp,first=header.next,prev=null;
            while (first.next!=null)
            {
               temp=first.next;
               first.next=prev;
               prev=first;
               first=temp;
               
            }
            first.next=prev;
            header.next=first   ;
        }
        public void findLoop()
        {
            Node first=header,second=header;
            while(second.next!=null)
            {
                first=first.next;
                second=second.next.next;
                if (first==second)
                {
                    System.out.println("Found Loop");
                    return;
                }
                
            }
            System.out.println("Not found");
            return;
        }
        public boolean isPalindrome()
        {
            Node first=this.middle();
            LinkedList b=new LinkedList();
            b.header.next=first;
            b.reverseList();
            Node l1=b.header,l2=this.header;
            while (l1!=null)
            {
                if (l1.data!=l2.data)
                    return false;
                l2=l2.next;
                l1=l1.next;
            }
            
            return true;
        }
        public void addNode(int n)
        {
            Node first=header;
            Node i=new Node(n);
           
            while(first.next!=null && first.next.data<n)
            {
                first=first.next;
            }
            i.next=first.next;
            first.next=i;
        }
        
    }
    public static void rec(Node k)
    {
        if (k==null)
            return;
        else
        {
            rec(k.next);
        }
        if (k.data!=-11)
        System.out.print(k.data+" ");
    }
    public static void link(LinkedList a,LinkedList b)
    {
        Node first=b.header;
        Node second=a.header;
        while (second.next!=null)
        {
            second=second.next;
        }
        first=first.next;
        second.next=first;
    }
    public static void intersection(LinkedList a,LinkedList b)
    {
        Node first=a.header;
        Node second=b.header;
        if(a.length()>b.length())
        {
            int count=abs(a.length()-b.length());
            while(count>0)
            {
                first=first.next;
                count--;
            }
        }
        else
        {
            int count=abs(a.length()-b.length());
            while(count>0)
            {
                second=second.next;
                count--;
            }
        }
        
        while((first!=null && second!=null) && first!=second)
        {
            first=first.next;
            second=second.next;
        }
        if (first!=null || second!=null)
            System.out.println(first.data);
        else
            System.out.println("No intersection");
        
    }
    public static int abs(int a)
    {
        if (a<0) return (-1)*a;
        else
            return a;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        LinkedList a= new LinkedList();
        LinkedList b=new LinkedList();
        a.push(9);
        a.push(8);
        a.push(7);
        a.push(6);
        a.push(5);
        a.push(4);
        a.push(3);
        a.push(2);
        a.push(1);
        b.push(1);
        b.push(2);
        b.push(3);
        
        a.traverse();
        a.addNode(-1);
        b.traverse();
        link(a,b);
        a.traverse();
        b.traverse();
        a.traverse();
        intersection(a,b);
        //System.out.println(a.isPalindrome());
        rec(a.header);
    }
    
}
