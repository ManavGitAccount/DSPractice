public class moveNegNumFront {

    static void moveNegativeNumbersToFront(int arr[], int n){
        int j= 0;
        int temp;
        for(int i = 0; i < n ; i++)
        {

            if(arr[i] <0 ){
                if(i != j){
                    //swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;

            }

        }
    }

    static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }

    }

    public static void main( String[] args ) {
        int arr[] = {9, 8, -6, 4, 5, -7, -4, 3};
        int size = arr.length;
        System.out.println("Lenght of the array" + arr.length);
        moveNegativeNumbersToFront(arr, size);
        printArray(arr);

    }
}
