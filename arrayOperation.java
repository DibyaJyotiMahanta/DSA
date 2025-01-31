public class arrayOperation {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for(int i =0; i<5; i++){
            arr[i] = i;
        }
        int sum = 0;
        for(int j:arr){
            sum+=j;
        }
        System.out.println(sum);
    }
}
