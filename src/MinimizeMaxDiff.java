import java.util.Arrays;

public class MinimizeMaxDiff {

    public static void main( String[] args ) {
        int[] arr = {1, 5, 15, 10};
        int k = 3;
        int ans = getMindDiff(arr, arr.length, k);
        System.out.println(ans);
    }

    static int getMindDiff(int[] arr, int n, int k){
        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        int tempmin, tempmax;
        tempmax = arr[n-1];
        tempmin = arr[0];

        for(int i=1; i<n; i++){

            // if on subtracting k we got negative then continue
            if(arr[i] - k < 0){
                continue;
            }

            // Minimum element when we add k to whole array
            tempmin = Math.min(arr[0] + k, arr[i]-k);

            //Maximum element when we subtract k from whole array
            tempmax = Math.max(arr[i-1] + k, arr[n-1] -k);

            ans = Math.min(ans, tempmax-tempmin);
        }

        return ans;
    }
}
