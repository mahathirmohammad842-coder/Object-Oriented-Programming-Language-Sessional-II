
package mahathirjavalab7;
public class InstanceVariable {
     String name;
        int salary;
       String dept;
       
       InstanceVariable(String name, int salary){ 
           this.name = name;
           this.salary = salary;
                  
       }
    
        InstanceVariable(String name, int salary, String dept){
        this(name,salary);
        this.dept =dept;
        
    }
        void display(){
            System.out.println(name);
            System.out.println(salary);
    
        }
}
