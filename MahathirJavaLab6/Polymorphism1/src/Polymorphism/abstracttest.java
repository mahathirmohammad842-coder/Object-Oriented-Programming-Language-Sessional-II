/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;


public class abstracttest {
    public static void main(String[] args) {
        AbstractClass a ;
        
        a = new AbstractR1();
        a.sendmessage();
        a = new AbstractR2();
        a.sendmessage();
        
    }
    
}
