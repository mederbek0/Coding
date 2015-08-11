/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queue1;

/**
 *
 * @author mederbekbegmatov
 */
public class Queue {
    int[] a;
    int top,bottom;
    public Queue(int n)
    {
        a=new int[n];
        top=0;
        bottom=0;
    }
    
    public void enqueue(int k)
    {
        a[top]=k;
        top++;
    }
    
    public int dequeue()
    {
        return a[bottom++];
    }
    public int peek()
    {
        return a[bottom];
    }
    public boolean isEmpty()
    {
        if (bottom>top)
            return true;
        else
            return false;
    }
    
}
