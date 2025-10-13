
//binary search in a infinite lengh array, basically you are unaware of the size of the array so cant use {arr.length}
public class BinarySearchInfiniteArray
{
    public static int binarySearch(int arr[], int target, int start, int stop){
        while(start<=stop){
            int mid = (start+stop)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                stop = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 6, 12, 23, 45, 119, 200, 350, 440, 550, 600, 2220, 3444, 5000, 7030, 20000, 20021, 30000};
		
		int target = 5;
		
		int start = 0;
		int stop = 1;
		int increment =2;
		
		while(target>arr[stop]){
		   start = stop+1;
		   stop = start+increment;
		   
		   
		}
		
		int ans = binarySearch(arr, target, start, stop);
		
		System.out.println(ans);
		
	}
}






