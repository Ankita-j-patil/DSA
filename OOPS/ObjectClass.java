

public class ObjectClass {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        // we can also write
        p1.color = "Pink";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "AnkitaPatil";
        // myAcc.password = "ank"; can't set like this because password is private 
        myAcc.setPassword("Ank");
        // but it is not accessible we only change password
        
    }
}

// Pen class
class Pen{
    String color ;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

// Student class
class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int physics,int chemistry,int maths){
        percentage = ((physics+chemistry+maths)/3)*100;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}