package OOP;

import static OOP.CSEstudent.count;

public class MainClass {
    public static void main(String[] args) {
        CSEstudent stu1 = new CSEstudent();
        CSEstudent stu2 = new CSEstudent("Shishir","Male","CSE",1025);
        
        
       CSEstudent stu3 = new CSEstudent("EEE",1010);
       CSEstudent stu4 = new CSEstudent("Mohammad");
             
        stu1.name  = "Mahathir ";
        stu1.gender  = "Male ";
        stu1.subject  = "CSE ";
        stu1.id  = 1016;

        stu1.information();
        System.out.println("");
        stu2.information();
        System.out.println("");
        stu3.information();
        System.out.println("");
        stu4.information();
        System.out.println("Count : "+count);
        
        
    }
 }
