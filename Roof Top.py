//https://www.geeksforgeeks.org/problems/roof-top-1587115621/1

 def maxStep(self, arr):
        #Your code here
   
        n=len(arr)
        count=0
        total=0
        for i in range(1,n):
            if arr[i] > arr[i-1]:
                count+=1
                total = max(total,count)
            else:
                count=0
        return total
