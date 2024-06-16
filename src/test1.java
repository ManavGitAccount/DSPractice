public class test1 {

    static int smallestElement(int arr[]){

        int temp = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < temp){
                temp  = arr[i];
            }
        }

        return temp;
    }

    static int biggestElement(int arr[]){

        int temp = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > temp){
                temp  = arr[i];
            }
        }

        return temp;
    }

    public static void main( String[] args ) {

        int arr[] = {4, 5, 6, 2, 3};
        System.out.println("Smallest value is : " + smallestElement(arr));
        System.out.println("Largest value is : " + biggestElement(arr));

    }
}
