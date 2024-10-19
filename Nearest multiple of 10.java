//https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1

class Solution {

    String roundToNearest(String str) {
        // Complete the function
        int n=str.length(), carry=0, i=n-1;
        if(str.charAt(i)>'5')   carry++;
        
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        i--;
        
        while(i>=0){
            int val = carry+(str.charAt(i)-'0');
            sb.insert(0,val%10);
            carry = val/10;
            i--;
        }
        
        
        if(carry>0) sb.insert(0,"1");
        
        return sb.toString();
    }
}
