/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahathirjavalab6;

/**
 *
 * @author mahat
 */
public class Employee1 {
    String name;
    int id;
    double salary;
    Employee1(String n,int i,double s){
        name=n;
        id=i;
        salary=s;
    }
    void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
    
}
