public class ReverseArray {

    static void reverseArray(int arr[], int start, int end){

        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end --;
        }
    }

    public static void printArray(int arr[], int size){
        for(int i=0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main( String[] args ) {

        int arr1[] = {5, 4, 3, 2, 1};
        System.out.println("Print the original array ");
        printArray(arr1, arr1.length);
        reverseArray(arr1,0, arr1.length-1);
        System.out.println("Reversed Array is : ");
        printArray(arr1, arr1.length);
    }

}
