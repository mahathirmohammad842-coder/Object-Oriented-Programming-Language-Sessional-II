
package mahathirjavalab7;
public class Encapsulation {
    private String name;
    private int age;

    public void setData(String n, int a){ //setter method
        name = n;
        age =a;
        
    }
    public String getName(){  //getter methods
        return name;
    }
    public int getAge(){
        return age;
    }
}
