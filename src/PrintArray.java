public class PrintArray {

    static void printwithLenght(int arr1[]){

        for(int i= 0; i < arr1.length; i++){
            System.out.printf(arr1[i] + "");
        }
    }

    static void printwithLenghtMinus1(int arr1[]){

        for(int i= 0; i < arr1.length-1; i++){
            System.out.printf(arr1[i] + "");
        }
    }

    public static void main( String[] args ) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("length of the array" + arr.length);
        printwithLenght(arr);
        System.out.println("\n");
        printwithLenghtMinus1(arr);
    }
}
