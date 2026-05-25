/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

/**
 *
 * @author mahat
 */
public class Circle extends Shape {
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    double area(){
        return 3.1416*radius*radius;
    }
    void display(){
        System.out.println(area());
    }
    
}
