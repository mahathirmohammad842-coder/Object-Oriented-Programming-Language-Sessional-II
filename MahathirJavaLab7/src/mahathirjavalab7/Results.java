
package mahathirjavalab7;
public class Results extends PrivateInheritance {
    
    void showResult(){
        System.out.println("Marks : "+getData());
    }
     
    public static void main(String[] args) {
        Results A = new Results();
        A.setData(100);
        A.showResult();
    }
    
}
