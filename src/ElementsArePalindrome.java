public class ElementsArePalindrome {

    static boolean isPalindrome(int N){

        String str = "" + N;
        int len = str.length();
        for(int i=0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }

    static boolean isPalinArray(int arr[], int n)
    {
        for (int i = 0; i<n; i++){
            boolean ans = isPalindrome(arr[i]);
            if(ans == false){
                return false;
            }

        }
        return true;
    }

    public static void main(String args[])
    {
        int[] arr = { 11, 221, 33 };

        // length of array
        int n = arr.length;

        boolean res = isPalinArray(arr, n);
        if (res == true)
            System.out.println("Array is a PalinArray");
        else
            System.out.println("Array is not a PalinArray");
    }
}

