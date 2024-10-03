//https://www.geeksforgeeks.org/problems/majority-vote/1

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        int n1=Integer.MAX_VALUE;
        int n2=Integer.MAX_VALUE;
        int f1=0;
        int f2=0;
        for(int num : nums){
            if(num == n1){
                ++f1;
            }else if(num == n2){
                ++f2;
            }else if(f1 == 0){
                n1=num;
                f1++;
            }else if(f2 == 0){
                n2=num;
                f2++;
            }else{
                f1--;
                f2--;
            }
        }
        f1=0;
        f2=0;
        for(int num : nums){
            if(num == n1){
                ++f1;
            }if(num ==n2){
                ++f2;
            }
        }
        List<Integer> res = new ArrayList<>();
        int n=nums.size();
        if(f1 > n/3){
            res.add(n1);
        }if(f2 > n/3){
            res.add(n2);
        }if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
