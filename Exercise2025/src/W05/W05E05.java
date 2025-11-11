/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;
import java.util.Scanner;

/**
 *
 * @author jites
 */
public class W05E05 {
    public static void main(String[] args) {
        // Setup object imports
        Scanner input = new Scanner(System.in);
        int check = 0;
        int evenCounter = 0; 
        int oddCounter = 0;
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.print("How many numbers will you enter: ");
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++){
            System.out.printf("Enter number %d: ", (i + 1));
            check = input.nextInt();
            
            if (check % 2 == 0){
                evenCounter++;
                evenSum += check;
            }
            else {
                oddCounter++;
                oddSum += check;
            }
        }
        System.out.printf("The even numbers are %d%n", evenCounter);
        System.out.printf("The odd numbers are %d%n", oddCounter);
        System.out.printf("The sum of even numbers are %d%n", evenSum);
        System.out.printf("The sum of odd numbers are %d%n", oddSum);
    }
}
