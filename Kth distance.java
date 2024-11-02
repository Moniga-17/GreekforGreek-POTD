//https://www.geeksforgeeks.org/problems/kth-distance3757/1

class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (i > k) {
                set.remove(arr[i - k - 1]);
            }
            if (!set.add(arr[i])) {
                return true;
            }
        }

        return false;
    }
}
