public class duplicateElementsinArray {


    static void returnDuplicateElements(int arr[], int size){

        System.out.println("Repeating elements are :  ");

        for(int i= 0; i < size-1; i++){
            for(int j = i+1; j<size;  j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + ",");
                }
            }
        }
    }

    public static void main( String[] args ) {
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int arr_size = arr.length;
        returnDuplicateElements(arr, arr_size);
    }
}
