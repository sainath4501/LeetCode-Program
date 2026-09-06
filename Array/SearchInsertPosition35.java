public class SearchInsertPosition35 {

    public  static int Search(int arr[], int target){

        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            
            int mid =(start + end)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }

    public static void main(String args[]){
        int arr[]={1,3,4,5,6,7,8};
        int target=2;
        System.out.println(Search(arr, target));
    }
}