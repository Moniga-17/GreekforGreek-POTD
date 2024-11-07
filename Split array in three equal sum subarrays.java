//https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1

class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        int totalSum = Arrays.stream(arr).sum();
        if (totalSum % 3 != 0) return Arrays.asList(-1, -1);

        int targetSum = totalSum / 3, currentSum = 0, count = 0;
        Integer i = null, j = null;

        for (int k = 0; k < arr.length; k++) {
            currentSum += arr[k];
            if (currentSum == (count + 1) * targetSum) {
                count++;
                if (count == 1) i = k;
                if (count == 2) {
                    j = k;
                    break;
                }
            }
        }
        return (i != null && j != null) ? Arrays.asList(i, j) : Arrays.asList(-1, -1);

    }
}
