public class DescBinarySearch{

    static int descBinarySearch(int arr[], int target){
        int start=arr.length-1, end =0;
         while(start>=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid+1;
            }
            else if(arr[mid]<target){
                start=mid-1;
            }
            else{
                return mid;
            }
         }
         return -1;
    }
    public static void main(String args[]){
        int arr[] = {100,90, 78, 33, 5, 0, -12, -23,-55};
        int ans = descBinarySearch(arr, -550);
        System.out.println(ans);
    }
} 
