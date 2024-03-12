public class stringComparison {
    public static void main(String args[]){
        String s1 = "Ankita";
        String s2 = "Ankita";
        String s3 = new String("Ankita");

        // if(s1 == s2){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // It does not compare values.It treat as object
        // if(s1 == s3){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
