public class RunningSum{
    public  static int[] runningSum(int[] nums) {
        int[] results = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            results[i]=sum;
        }
        return results;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int [] result = runningSum(arr);
        for(int i:result){
            System.out.print(" "+i);
        }
    }
} 
    
