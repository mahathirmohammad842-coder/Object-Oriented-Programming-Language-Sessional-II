package OOP;
public class CSEstudent {
    String name,gender,subject;
    static String university_name= "BAUST";
    int id;
    static int count;
    CSEstudent(){}
    CSEstudent(String n, String g,String s , int i){
        name = n;
        gender = g;
        subject = s;
        id  = i;
        count = count+1;
    }
   
    CSEstudent(String n){
        name = n;
        count = count+1;
    }
    CSEstudent(String dept, int i){
        subject = dept;
        id = i;
        count = count+1;
    }
   void information(){
       System.out.println("Name: "+name);
       System.out.println("Gender: "+gender);
       System.out.println("Subject: "+subject);
       System.out.println("ID: "+id);
       System.out.println("University Name: "+university_name);      
   }
}


