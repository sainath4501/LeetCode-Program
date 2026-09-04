public class MissingNumber {

    public static int Miss(int nums[]){
        int n=nums.length;
        int Expected=n*(n+1)/2;
        int number=0;

        for(int i=0;i<n;i++){
            number += nums[i];
        }
        return Expected - number;
    }

    public static void main(String[] args) {
        int arr[]={0,2,3,4};
        System.out.println(Miss(arr));   
    }
}