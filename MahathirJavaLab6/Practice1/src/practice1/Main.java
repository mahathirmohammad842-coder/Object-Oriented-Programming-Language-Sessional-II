/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice1;

/**
 *
 * @author mahat
 */
public class Main {
    public static void main(String[] args) {
        Shape s1;
        Shape s2 = new Triangle(5,10);
        s2.display();
        Shape s3 = new Circle(5);
        s3.display();
        s1 = new Rectangle(10,6);
        s1.display();
    }
    
}
