
package polymorphism2test;

public class Rectangle extends Shape {
     double length, width;
    
     Rectangle(float l , float w){
         length = l;
         width = w;
     }
     
     double area(){
         return length*width; //system.out.println("Area : "+length*+width)
     }
}
