/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

/**
 *
 * @author mahat
 */
public class Triangle extends Shape {
    double base, height;
    
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5*base*height;
    }
    void display(){
        System.out.println(area());
    }
    
    
}
