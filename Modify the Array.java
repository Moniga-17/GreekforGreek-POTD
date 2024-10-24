//https://www.geeksforgeeks.org/problems/ease-the-array0633/1

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num != 0) {
                result.add(num);
            }
        }
        
        for (int i = result.size(); i < n; i++) {
            result.add(0);
        }

        return result;
    }
}
