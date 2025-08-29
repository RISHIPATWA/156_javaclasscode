

public class Copyconstructor {
    int Emp_id;
    String Emp_name;

    Copyconstructor(int id,String name){
        Emp_id = id;
        Emp_name= name;
    }

    Copyconstructor(Copyconstructor s){
        Emp_id = s.Emp_id;
        Emp_name = s.Emp_name;

    }
    public void Display(){
        System.out.println("Details of the Employee: "+Emp_id+" "+Emp_name);
    }

    public static void main(String[] args){
        Copyconstructor s1 = new Copyconstructor(101,"Rishi");
        Copyconstructor s2 = new Copyconstructor(s1);
<<<<<<< HEAD:156_CS301L-main/156_CS301L-main/Copyconstructor.java
=======
        // s2.Emp_id = 102;
        // s2.Emp_name= "Patwa";
>>>>>>> d91ef5e0a968b691dff0df8a63175a2199664bc6:Copyconstructor.java
        s1.Display();
        s2.Display();


    }
}
