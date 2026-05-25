/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author mahat
 */
public class Student {
   private String name;
    private int age;
    Student(){};
    
    
    Student(String name, int age)
    {
        this.name =name;
        this.age = age;
    }
    void introduce(){
        System.out.println("Hello, "+name);
        System.out.println("Your age : "+age);
    }
    void setName(String new_name){
    this.name = new_name;
    }
    String getName(){
        return name;
    }
    
}
