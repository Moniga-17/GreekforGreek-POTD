//https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1

class Solution {
    public int maxDistance(int[] arr) {
        // Code here
        HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxDistance = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!firstOccurrence.containsKey(arr[i])) {
                firstOccurrence.put(arr[i], i);
            } else {
                int distance = i - firstOccurrence.get(arr[i]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }

        return maxDistance;
    
    }
}
