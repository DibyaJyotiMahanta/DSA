public class MinNumberArray{

    public static int min(int arr[]){
        int min = arr[0];

        for(int element:arr){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[] = {43, 8, 100, -1, 0, -2, 50};
        System.out.println(min(arr));
    }
}