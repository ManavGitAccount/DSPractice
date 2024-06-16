import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsSubSeq {

    static int longestSubSequence(int arr[], int n){

        //Sort the array
        Arrays.sort(arr);

        int ans = 0;
        int count = 0;

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(20);

        // Insert repeated elements only once in the vector
        for(int i = 1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arrList.add(arr[i]);
            }
        }

        // Find the max length by inserting the array
        for(int i=0; i<arrList.size(); i++){

            //Check if current element is equal to the previous element
            if(i > 0  && arrList.get(i) == arrList.get(i-1) + 1){
                count++;
            }
            else
                count = 1;

            ans = Math.max(ans, count);
        }

        return ans;

    }

    public static void main( String[] args ) {

        int arr[] = {1, 9, 3, 10, 4, 20};
        int k = arr.length;

        System.out.println(longestSubSequence(arr, k));

    }
}
