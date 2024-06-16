public class mergeTwoSortedArrays {

    public static void mergeSortedArrays(int arr1[], int arr2[], int n, int m, int arr3[]){

        int i = 0;
        int j = 0;
        int k = 0;
        while( i < n && j <m){

            if(arr1[i] < arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else
                arr3[k++] = arr2[j++];
        }

        while(i < n){
            arr3[k++] = arr1[i++];
        }

        while(j < m){
            arr3[k++] = arr2[j++];
        }
    }

    public static void main( String[] args ) {

        int arr1[] = {3, 4, 5, 9};
        int n = arr1.length;

        int arr2[] = {1, 2, 6, 7, 8};
        int m = arr2.length;

        int arr3[] = new int[n+m];

        mergeSortedArrays(arr1, arr2, n, m, arr3);

        for(int i = 0; i<n+m; i++){
            System.out.printf( arr3[i] + " ");
        }
    }
}
