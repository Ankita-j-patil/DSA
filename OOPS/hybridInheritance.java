public class hybridInheritance {
    public static void main(String args[]){
        Peacock p1 = new Peacock();
        p1.fly();
    }
}

class Animal{
    String color;

   void eat(){
    System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }

}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Shark extends Fish{
    int fins;
}

class Peacock extends Bird{
    int legs;
}
