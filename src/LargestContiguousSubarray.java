public class LargestContiguousSubarray {


    static int contiguousSubArrayMethod(int arr[]){

        int size = arr.length;
        int max_num = Integer.MIN_VALUE;
        int current_sum = 0;

        for(int i = 0; i < size; i++){
            current_sum = current_sum + arr[i];

            if(max_num < current_sum){
                max_num = current_sum;
            }
            if(current_sum < 0){
                current_sum = 0;
            }
        }

        return max_num;
    }

    public static void main( String[] args ) {

        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " + contiguousSubArrayMethod(a));
    }
}
