public class MinNumberArrayRange {

    public static int min(int arr[], int min, int max){
        if (min<0||min>arr.length||max<0||max>arr.length||min>max){
        return -1;
    }
    else{
        int minn = arr[min];
        for(int i = min; i<=max; i++){
            if(arr[i]<minn){
                minn = arr[i];
            }

        }
        return minn;
    }

    }
    
    public static void main(String args[]){
        int arr[] = {2, 13, -2, 100, 32, -10, 11, 2, 30, 99, 2000, 3, 40, 22, 15};
        System.out.println(min(arr, 6,5));
    }
}
