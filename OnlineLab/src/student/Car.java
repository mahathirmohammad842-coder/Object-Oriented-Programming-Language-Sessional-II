/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author mahat
 */
public class Car extends Vehicle {
    
    int speed;
    Car(String B,int s){
        this.brand = B;
        this.speed = s;
    };
    void display2(){
     
        System.out.println("Brand :"+brand);
        System.out.println("Speed :"+speed);
    }
}
