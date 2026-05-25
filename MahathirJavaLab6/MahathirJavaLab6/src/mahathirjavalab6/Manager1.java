/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahathirjavalab6;

/**
 *
 * @author mahat
 */
public class Manager1 extends Employee1 {
    double bonus;
    double totalSalary;
    
    Manager1(String n,int i,double s){
        super(n,i,s);
        bonus=salary*0.10;
        totalSalary=salary+bonus;
        
    }
    void show1(){
         System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+totalSalary);
    }
}