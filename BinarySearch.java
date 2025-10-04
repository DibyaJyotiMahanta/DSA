public class BinarySearch{

    public static int binarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }

            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {-21,-10, -2, 1, 10, 32, 45, 66, 98, 100, 200};
        int index = binarySearch(arr, 2000);
        System.out.println(index);
    }
} 
