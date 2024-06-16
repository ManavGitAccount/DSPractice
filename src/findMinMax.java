public class findMinMax {

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){

        Pair minMax = new Pair();
        int i;

        if(n == 1){
            minMax.max = arr[0];
            minMax.min = arr[1];
            return minMax;
        }

        if(arr[0] > arr[1]){
            minMax.min = arr[1];
            minMax.max = arr[0];
        }
        else{
            minMax.min = arr[0];
            minMax.max = arr[1];
        }

        for(i = 2; i<n; i++){

            if(arr[i] > minMax.max){
                minMax.max = arr[i];
            }
            else if(arr[i] < minMax.min){
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    public static void main( String[] args ) {

        int arr[] = {100, 5, -5, 78, 90, -199};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\n Minimum element is %d ", minmax.min);
        System.out.printf("\n Maximum element is %d ", minmax.max);

    }
}
