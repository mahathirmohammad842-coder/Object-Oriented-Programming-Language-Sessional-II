/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahathirjavalab3;
import java.util.Scanner;
/**
 *
 * @author mahat
 */
import java.util.Scanner;

public class JavaLab3_Prime_Number {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt(); 
        
        if(a <= 1){
            System.out.println("Not Prime");
        } else {
            int count = 0;
            for(int i = 2; i < a; i++){
                if(a % i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}

