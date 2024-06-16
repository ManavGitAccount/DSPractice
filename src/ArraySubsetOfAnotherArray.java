public class ArraySubsetOfAnotherArray {

    static boolean isSubset(int arr1[], int arr2[], int m, int n){

        int i = 0;
        int j = 0;

        for(i = 0; i< n; i++){

            for( j = 0; j<m; j ++){
                if (arr1[i] == arr2[j]){
                    break;
                }
            }

            if(j==m){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        int arr1[] = { 11, 3, 7, 1 };
        int arr2[] = { 11, 1, 13, 21, 3, 7 };


        int n = arr1.length;
        int m = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr1[] is "
                    + "subset of arr2[] ");
        else
            System.out.print("arr1[] is "
                    + "not a subset of arr2[]");
    }
}

