/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahathirjava;
import java.util.Scanner;
/**
 *
 * @author mahat
 */
public class Lab_2_Java_Leap_Year {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        // Leap year logic
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
        sc.close();
    }  
}
