import java.util.HashSet;

public class unionAndIntersection {

    public static void printIntersecton(int arr1[], int arr2[]){

        HashSet<Integer> myHasSet = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            myHasSet.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            myHasSet.add(arr2[j]);
        }

        System.out.printf(myHasSet+ "");
    }

    static void printIntersectionofArrays(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hashset = new HashSet<>();

        for(int i=0; i< arr1.length; i++){
            hs.add(arr1[i]);
        }

        for(int i = 0; i <arr2.length; i++){
            if(hs.contains(arr2[i])){
                hashset.add(arr2[i]);
            }
        }
        System.out.printf(hashset + "");
    }
    public static void main( String[] args ) {
        int arr1[] = {4, 5, 6, 1, 2, 4, 9};
        int arr2[] = {5, 3, 100, 2};

        System.out.printf("Union");
        printIntersecton(arr1, arr2);

        System.out.println("\n");
        System.out.println("intersection");
        printIntersectionofArrays(arr1, arr2);
    }
}
