//https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/1

class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> total = new ArrayList<>();
        boolean vis[] = new boolean[101];
        for(int i:arr){
            if(!vis[i]) total.add(i);
            vis[i]=true;
        }
        return total;
    }
}
