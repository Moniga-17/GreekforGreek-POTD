//https://www.geeksforgeeks.org/problems/total-count2415/1

int totalCount(int k, int[] arr) {
        // code here
        int count=0;
        int m;
        for(int num:arr){
            m=num%k;
            if(m!=0){
                count=count+(num/k)+1;
            }else{
                count=count+(num/k);
            }
        }
        return count;
    }
