/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahathirjavalab6;

/**
 *
 * @author mahat
 */
public class Manager extends Employee {
    double bonus;
    Manager(String n,int i,double s,double b){
        super(n,i,s);
        bonus=b;
    }
    void show1(){
         System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
    }
    
}
