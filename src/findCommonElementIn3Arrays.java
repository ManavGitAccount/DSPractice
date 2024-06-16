//The three arrays have to be sorted

public class findCommonElementIn3Arrays {

    static void printIntersection(int arr1[], int arr2[] , int arr3[]){
        int i= 0;
        int j=0;
        int k = 0;

        while(i < arr1.length && j < arr2.length && k < arr3.length){

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                System.out.printf(arr1[i]  + " ");
                i++;
                j++;
                k++;
            }

            else if(arr1[i] < arr2[j]){
                i++;
            }

            else if(arr2[j] < arr3[k]){
                    j++;
            }
            else
                k ++;
        }
    }


    public static void main( String[] args ) {
        int arr1[]= {5 , 6, 7,  8, 9};
        int arr2[] = {1, 2, 3, 4, 5, 6, 7};
        int arr3[] = {3, 4, 5, 6, 7};

        printIntersection(arr1, arr2, arr3);
    }
}
