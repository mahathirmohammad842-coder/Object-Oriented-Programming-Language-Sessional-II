/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism2test;

/**
 *
 * @author mahat
 */
public class Triangle extends Shape {
    double base, height;
    
    Triangle(float b, float h){
        base = b;
        height = h;
    }
    
   double area(){
       return 0.5*base*height;
   }
    
}
