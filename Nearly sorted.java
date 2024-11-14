//https://www.geeksforgeeks.org/problems/nearly-sorted-1587115620/1

class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        // code
        Arrays.sort(arr, 0, k);  
        Arrays.sort(arr);        

    }
}
