//https://www.geeksforgeeks.org/problems/subarray-range-with-given-sum0128/1

class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cur=0, ans=0;
        for(int i:arr){
            cur+=i;
            ans+=map.getOrDefault(cur-tar,0);
            map.merge(cur,1,Integer::sum);
        }
        return ans;
    
    }
}
