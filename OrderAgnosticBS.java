class OrderAgnosticBS{


    static int orderAgnosticBS(int arr[], int target){
        boolean isAsc = false;

        if(arr[0]<arr[arr.length-1]){
            isAsc = true;
        }

        if(isAsc){
            int start = 0, end = arr.length-1;

            while(start<=end){
             int mid=(start+end)/2;

             if(arr[mid]>target){
                end = mid-1;
             }
             else if(arr[mid]<target){
                start = mid+1;
             }
             else{
                return mid;
             }
            }
        }
        else{
            int end = 0, start = arr.length-1;

            while(start>=end){
             int mid=(start+end)/2;

             if(arr[mid]>target){
                end = mid+1;
             }
             else if(arr[mid]<target){
                start = mid-1;
             }
             else{
                return mid;
             }
            }
        }
        return -1;


    }

    public static void main(String []args){
        int arr[] = {0, 12, 34, 56, 78, 90, 100, 103, 2001};
        int arr2[] = {99, 94, 86, 75, 64, 32, 22, 21, 13, 1};

        int index = orderAgnosticBS(arr2, 94);

        System.out.println(index);
    }
} 
