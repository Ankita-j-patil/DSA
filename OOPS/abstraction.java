public class abstraction {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); 

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a = new Animal();
        // cannot create an instance

        Mustang m = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
