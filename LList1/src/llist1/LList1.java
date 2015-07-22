/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package llist1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.String;
import java.util.Scanner;
import java.util.List;
import java.io.File;
/**
 *
 * @author mederbekbegmatov
 */
public class LList1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       // String content = new String(Files.readAllBytes(Paths.get("input.txt")));
       // System.out.println(content);
       // while(content.hasNextLine())
        Scanner s = new Scanner(new File("input.txt"));
        int[] array = new int[s.nextInt()];
        int[] array3 = new int[array.length];
        
        for (int i = 0; i < array.length; i++)
            array[i] = s.nextInt(); 
        int[] array1=new int[s.nextInt()];
        for(int i=0;i<array1.length;i++)
            array1[i]=s.nextInt();
        for(int i=0;i<array1.length;i++)
            array3[i]=array[i]+array1[i];
        for(int i=0;i<array1.length;i++)
            System.out.print(array3[i]+" ");
        
        
    }
    
}
