//https://www.geeksforgeeks.org/problems/smallest-number-subset1220/1

class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long answer=1;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>answer){
                return answer;
            }
            answer+=arr[i];
        }
        return answer;
    }
}
