/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue2;

/**
 *
 * @author mederbekbegmatov
 */
public class Queue {
    Node top;
    Node bottom;
    public Queue()
    {
        bottom=null;
        top=null;
    }
    public void enqueue(Node k)
    {
            if (isEmpty())
            {
                top=k;
                bottom=k;
            }
            bottom.next=k;
            bottom=bottom.next;   
    }
    
    public int dequeue()
    {
        if (top!=null)
        {
            Node k=top;
            top=top.next;
            return k.data;
        }
        return -1;
    }
    public int peek()
    {
        return top.data;
    }
    
    public boolean isEmpty()
    {
        if (bottom==null)
            return true;
        else
            return false;
    }
    
            
    
}
