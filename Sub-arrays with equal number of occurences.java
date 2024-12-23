//https://www.geeksforgeeks.org/problems/sub-arrays-with-equal-number-of-occurences3901/1

class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int fa=0, fb=0, ans=0;
        for(int i:arr){
            if(i==x)    fa++;
            else if(i==y)   fb++;
            ans+=map.getOrDefault(fa-fb,0);
            map.merge(fa-fb,1,Integer::sum);
        }
        return ans;
    }
}
