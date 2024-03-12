public class substring {
    public static String printSubstring(String str,int si,int ei){
        String subStr ="";
        for(int i =si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println(printSubstring(str,0,4));
    }
}
