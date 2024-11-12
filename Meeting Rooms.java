//https://www.geeksforgeeks.org/problems/attend-all-meetings/1

class Solution {
    static boolean canAttend(int[][] arr) {
        // Your code here
        
        List<int[]> intervalList = new ArrayList<>();
        for (int[] interval : arr) {
            intervalList.add(interval);
        }

        Collections.sort(intervalList, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        for (int i = 1; i < intervalList.size(); i++) {
            if (intervalList.get(i)[0] < intervalList.get(i - 1)[1]) {
                return false; 
            }
        }

        return true; 

    }
}
