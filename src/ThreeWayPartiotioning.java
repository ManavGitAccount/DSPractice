public class ThreeWayPartiotioning {

    public static void threeWayPartitioning(int [] arr, int lowval, int highval){


        int n = arr.length;

        int start=0;
        int end = n-1;

        for(int i = 0; i<=end;){
            if(arr[i] < lowval){
                //swap
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start ++;
                i++;
            }

            else if(arr[i] > highval){
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }
            else
                i++;
        }
    }

    public static void main( String[] args ) {

        int arr[] = {10, 80, 35, 25, 45 , 20};

        threeWayPartitioning(arr, 30, 40);

        System.out.println("Modified Array");

        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}
