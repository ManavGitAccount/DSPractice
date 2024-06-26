import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlappingIntervals {

    public static class Interval{

        int start, end;
        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void mergeIntervals(Interval arr[]){

        if(arr.length <= 0 ){
            return;
        }

        Stack<Interval> stack = new Stack<>();

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare( Interval i1, Interval i2 ) {
                return i1.start - i2.start;
            }
        });

        stack.push(arr[0]);

        for(int i = 1; i<arr.length; i++){

            Interval top = stack.peek();

            if(top.end < arr[i].start)
            {
                stack.push(arr[i]);
            }

            else if(top.end < arr[i].end){
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }

        }

        System.out.print("The merged intervals are: ");
        while(!stack.isEmpty()){
            Interval t = stack.pop();
            System.out.print("[" + t.start + ", " + t.end + "] ");
        }
    }


    public static void main( String[] args ) {
        Interval arr[] = new Interval[4];

        arr[0] = new Interval(2,4);
        arr[1] = new Interval(1,3);
        arr[2] = new Interval(9,10);
        arr[3] = new Interval(6,8);

        mergeIntervals(arr);
    }


}
