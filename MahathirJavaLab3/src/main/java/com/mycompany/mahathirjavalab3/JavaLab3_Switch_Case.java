package com.mycompany.mahathirjavalab3;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahat
 */
public class JavaLab3_Switch_Case {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        switch(a){
            case 1:
                System.out.println("One ");
                break;
            case 2:
                System.out.println("Two ");
                 break;
            case 3:
                System.out.println("Three"); 
                 break;
            case 4:
                System.out.println("Four ");
                 break;
                
            default: 
                System.out.println("Not a valid Digit");
                 break;
        }
    }
    
}
