public class Solution {
    int missingNum(int arr[]) {
        
        int n=arr.length;
        
        int estimate=n*(n+1)/2; //number star with 0
        int estimate=(n+1)*(n+2)/2; //number star with 1
        
        int val=0;
        
        for(int i=0;i<arr.length;i++){
            val+=arr[i];
        }
        int value=estimate-val;
        return value;
    }
} {
    
}
