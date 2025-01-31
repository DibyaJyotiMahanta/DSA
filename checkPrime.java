public class checkPrime {
    public static void main(String[] args) {
        int num = 10;
        int counter =0;
        if(num<2){
            counter= 1;
        }
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                counter = 1;
                break;
            }
            else{
                counter = 0;
            }
        }
        if(counter == 1){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime Number");
        }
       

    }
}
