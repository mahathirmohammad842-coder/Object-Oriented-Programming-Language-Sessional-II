/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author mahat
 */
public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();
//        Stu1 s2 =new Stu1();
//        s2.display();
//        Stu2 s3 = new Stu2();
//        s3.display();


  
        s1.display();
        s1 =new Stu1();
        s1.display();
        s1 = new Stu2();
        s1.display();
    }
    
}
