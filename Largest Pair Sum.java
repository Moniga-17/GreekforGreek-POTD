//https://www.geeksforgeeks.org/problems/pair-sum--120604/1

class Solution {
    public static int pairsum(int[] arr) {
        // code here

        if (arr.length < 2) {
            //throw new IllegalArgumentException("Array must contain at least two elements.");
            return 0;
        }

        Arrays.sort(arr);
        int n = arr.length;
        
        return arr[n-1] + arr[n-2];

    }
}
