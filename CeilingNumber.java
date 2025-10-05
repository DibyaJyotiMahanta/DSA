// Ceiling Number is a number which is smallest but greater or equal tot he target element.

class CeilingNumber{

   static int ceilingNumber(int arr[], int target){
        int start =0, end = arr.length-1;

        int ans=-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]<target){
                start = mid+1;
            }
            else if(arr[mid]>target){
                end = mid-1;
                ans = arr[mid];
            }
            else{
                ans = arr[mid];
                break;
            }
            
        }
        return ans;
    }


    public static void main(String []args){
        int arr[] = {2, 3, 6, 19, 34, 56, 69, 80, 100};

        int ans = ceilingNumber(arr, 101);

        System.out.println(ans);
    }
} 
