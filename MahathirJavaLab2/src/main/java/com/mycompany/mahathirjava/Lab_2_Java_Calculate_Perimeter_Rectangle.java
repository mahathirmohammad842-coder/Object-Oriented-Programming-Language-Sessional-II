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
public class Lab_2_Java_Calculate_Perimeter_Rectangle {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length
        System.out.println("Enter the length of the rectangle: ");
        float length = sc.nextFloat();

        // Input width
        System.out.println("Enter the width of the rectangle: ");
        float width = sc.nextFloat();

        // Calculate perimeter
        float perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter of the rectangle: " + perimeter);

        sc.close();
    }

}
