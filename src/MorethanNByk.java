import java.util.HashMap;
import java.util.Map;

public class MorethanNByk {

    public static void morethanNBYKTimes(int arr[], int n, int k){

        int x = n / k;

        //Hash map initialization
        HashMap<Integer, Integer> y = new HashMap<>();

        //count the frequency of each element.
        for(int i = 0; i < n ; i++){
            if(!y.containsKey(arr[i])){
                y.put(arr[i], 1);
            }

            // if element does exist in the hash table
            else {
                int count = y.get(arr[i]);
                y.put(arr[i], count + 1);
            }
        }

        // Iterate over each element in the hash table and check their
        // frequency. If it is more than n/k, print it.
        for(Map.Entry m : y.entrySet()) {
            Integer temp = (Integer)m.getValue();
            if(temp > x){
                System.out.println(m.getKey());
            }
        }

    }

    public static void main( String[] args ) {
        int a[] = new int[]{1, 1, 2, 6, 2, 3, 3, 3, 5, 4, 2, 2, 2, 3, 1, 1, 1, 6};
        int n = 13;
        int k =6;

        morethanNBYKTimes(a, n, k);
    }
}
