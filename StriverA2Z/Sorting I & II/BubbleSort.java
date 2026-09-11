public class BubbleSort {

    public static void bubble(int arr[]){
        int n=arr.length;
        int swap=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,1,6,8,9,6,8};
        bubble(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}