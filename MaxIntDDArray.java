
class MaxIntDDArray {

    public static int maxInt(int arr[][]){
        int max = arr[0][0];

        for(int arrr[]:arr){
            for(int ele :arrr){
                if(max<ele){
                    max = ele;
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr[][] = {
            {1, 100, 21},
            {-1, 60},
            {20, 40, 20, 11, 160}};

        System.out.println(maxInt(arr));
    }
}
