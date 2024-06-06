public class copyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Ankita";
        s1.roll = 38;
        s1.password = "xyz"; 

        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[2] =100;   

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        this.marks = s1.marks;
    }
    
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");

    }

    
    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];  
        this.roll = roll;
    }
}

