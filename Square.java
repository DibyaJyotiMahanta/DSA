public class Solution {
    public static  boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        else if(n==1){
            return true;
        } 
        else if(n%2!=0){
            return false;
        }
        isPowerOfTwo(n/2);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(23));
    }
}