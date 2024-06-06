public class typesOfConstructors {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Ankita");
        Student s3 = new Student(38);
    }
}

class Student{
    String name;
    int roll;

    // Non Parameterised constructor
    Student(){
        System.out.println("Constructor is called");

    }

    // Parameterised constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}

// This is also called as constructor overloading