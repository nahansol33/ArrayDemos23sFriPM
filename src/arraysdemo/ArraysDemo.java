/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author Hansol
 */
import java.util.Scanner;
public class ArraysDemo {
    //added comment for pull

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a world: ");
       String s1 = input.nextLine();
       String []myArray = s1.split("");
       for (int i = myArray.length - 1; i>=0; i--){
           System.out.print(myArray[i]);
       }
        // TODO code application logic here
    }
    
}
