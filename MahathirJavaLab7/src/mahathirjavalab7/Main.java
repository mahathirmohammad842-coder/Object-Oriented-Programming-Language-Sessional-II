package mahathirjavalab7;


public class Main {
    public static void main(String[] args) {
        int result = StaticMethod.add(10,20);
    System.out.println("Sum = "+result);
    
    InstanceVariable Obj = new InstanceVariable("Mahathir",1000000);
    Obj.display();
    
    Encapsulation s1 = new Encapsulation();
    s1.setData("Mahathir",23);
    
        System.out.println("Student Name :"+s1.getName());
        System.out.println("Student Age : "+ s1.getAge());
    
    }
    
}
