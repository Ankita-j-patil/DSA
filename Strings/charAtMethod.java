public class charAtMethod {
    public static void printCharacters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String name = "Ankita Patil";
        // to print single character at a time
        // System.out.println(name.charAt(0));

        printCharacters(name);

    }
}
