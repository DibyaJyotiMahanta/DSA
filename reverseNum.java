public class reverseNum{
    public static void main(String args[]){
        int num = 121;
        int orginalNum=num;
        int rev = 0;
        for(int i =0; i<3; i++){
            int temp = num%10;
            rev=rev*10+temp;
            num = num/10;
        }
        System.out.println(rev==orginalNum);
    }
}