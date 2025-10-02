import java.util.Arrays;

class TwoDArraySearch{

    public static int[] find(int arr[][], int target){
        int answer[] = {0,0};

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
    public static void main(String args[]){
        int arr[][] = {
            {1,30,21},
            {30, 1, 22, 89,12},
            {100, 11}
        };

        int ans[] = find(arr, 1);

        System.out.println(Arrays.toString(ans));
    }
} 
