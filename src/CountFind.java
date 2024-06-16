public class CountFind {

    static void findGivenSum(int[] arr, int k){

        //Initialize Result
        int count = 0;

        //Consider all possible pairs and check their sum
        for(int i=0; i< arr.length; i++){

            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    count ++;
                }
            }
        }
        System.out.printf("Count of the pais is  %d ", count);

    }

    public static void main( String[] args ) {
        int[] arr = {1, 5, 7, -1, 5};
        int K = 6;
        findGivenSum(arr,K);
    }
}
