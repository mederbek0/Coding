/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack2;

/**
 *
 * @author mederbekbegmatov
 */
public class Stack {
    LinkedList list;
    public Stack(){
        list=new LinkedList();
    }
    public void push(char c){
        list.addNode(new Node(c));
    }
    
    public char pop(){
        if(list.head==null){
            System.out.println("Stack is empty");
        }else
        {
            return list.remove().data;
        }
    return '0';
    }
    
    
    public void print(){
        list.print();
        System.out.println();
    }
    
    public char peek(){
        if (list.head!=null)
            return list.head().data;
      return 0;  
    }
    public boolean isEmpty(){
        if (list.head==null)
            return true;
        return false;
    }
    
}
