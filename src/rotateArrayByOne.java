public class rotateArrayByOne {

    static void rotate(int arr[])
    {
        int x = arr[arr.length-1];
        for(int i = arr.length-1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;

    }

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.printf( arr[i] + " ");
        }
    }

    public static void main( String[] args ) {

        int arr1[] = {1, 2, 3, 4, 5};
        rotate(arr1);
        printArray(arr1);

    }
}
