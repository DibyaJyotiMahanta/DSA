public class SearhInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }
         
            else if (target < nums[i]) {
                result = i;
                break;
            }
        }
   
        if (target > nums[nums.length - 1]) {
            result = nums.length;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6};
        System.out.println(searchInsert(arr, 0)); 
        System.out.println(searchInsert(arr, 5)); 
        System.out.println(searchInsert(arr, 7)); 
    }
}
