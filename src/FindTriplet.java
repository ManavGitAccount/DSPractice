public class FindTriplet {

    static boolean findTheTriplet(int arr[], int size, int sum){

        for(int i = 0; i < size-2; i++){
            for( int j = i+1; j < size -1; j++){
                for(int k = j + 1; k < size; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.print("Triplet is " + arr[i] +","+ arr[j] +","+ arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;

    }


    public static void main( String[] args ) {

        FindTriplet tt = new FindTriplet();
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 13;
        int arr_size = arr.length;

        tt.findTheTriplet(arr, arr_size, sum);
    }
}
