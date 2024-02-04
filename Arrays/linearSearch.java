public class linearSearch {

    public static int linear_search(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {2,4,6,8,10,12,14,16};
        int key =20;
        int index = linear_search(array,key);
        if(index == -1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is at an index : "+index );
        }
        
    }
    
}
