//https://www.geeksforgeeks.org/problems/swap-and-maximize5859/1

class Solution {
    public long maxSum(Long[] arr) {
        // code here
        Arrays.sort(arr);

        int n = arr.length;
        Long[] result = new Long[n];

        int left = 0, right = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = arr[left++];
            } else {
                result[i] = arr[right--];
            }
            flag = !flag;
        }

        long maxSum = 0;
        for (int i = 1; i < n; i++) {
            maxSum += Math.abs(result[i] - result[i - 1]);
        }
        maxSum += Math.abs(result[n - 1] - result[0]);

        return maxSum;
    }

}
