public class dutchNationalFlag {

    static void sort(int a[], int size){

        //this is important
        int low = 0;
        int high = size -1;
        int mid = 0;
        int temp = 0;

        while(mid <= high){

            switch(a[mid]){
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = a[mid];
                    a[mid]  = a[high];
                    a[high] = temp;
                    high --;
                    break;
            }
        }

    }
    static void printArray(int arr[], int size) {
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("");
    }

    public static void main(String[] args)
    {
        int arr[] = { 2, 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1, 2, 2};
        int arr_size = arr.length;
        sort(arr, arr_size);
        printArray(arr, arr_size);
    }
}
