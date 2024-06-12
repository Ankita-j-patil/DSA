public class superKeyword {
    public static void main(String args[]){
        Horse h = new Horse(); 
        
    }
}

class Animal{
    Animal(){
        String color;
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
       
        System.out.println("Horse constructor is called");
    }
}
