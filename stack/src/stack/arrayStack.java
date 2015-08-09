/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.io.*;
/**
 *
 * @author mederbekbegmatov
 */
public class arrayStack {
    int top;
    int[] arr;
    public arrayStack(int n){
        arr= new int[n];
        top=-1;
    }
    public void push(int a){
        try {
            top++;
            arr[top]=a;
        }catch(IndexOutOfBoundsException e){
            System.out.println("exception: "+e.getMessage());top--;
        }
        
        
    }
    public void pop(){
        if (top>=0)
            System.out.println(arr[top--]);
        else
            System.out.println("Stack is empty");
    }
    public void print(){
        int n=top;
        while(n>=0)
        {
            System.out.print(arr[n]+" ");
            n--;
        }
    
    }
    public int peek(){
        if (top>-1)
            return arr[top];
        else
        {
            System.out.println("Stack is empty");
         return -1;   
        }
    }
    
    
    
    
}
