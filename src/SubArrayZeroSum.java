public class SubArrayZeroSum {

    static boolean zeroSumArray(int arr[], int n){

        for(int i = 0; i < n; i++){
            int sum = arr[i];
            if(sum==0){
                return true;
            }
            for(int j = i+1; j < n; j++){
                sum += arr[j];
                if(sum == 0){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main( String[] args ) {
        int[] arr = {5, -4, -1};
        System.out.println("Is this a zero sum array " + zeroSumArray(arr, arr.length));
    }
}
