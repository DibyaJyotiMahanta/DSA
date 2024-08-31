import java.util.Scanner;

class Hashset{
    int[] hashmap(String s, int[] arr){

        for(int i= 0; i<s.length(); i++){
            int j = s.charAt(i)-97;
            arr[j]=arr[j]+1;
        }

        return arr;
    }
}
public class StringHashing {
    public static void main(String[] args) {
        String s = "hello";
        int[] arr = new int[26];

        Hashset h = new Hashset();
        arr = h.hashmap(s, arr);

        Scanner sc = new Scanner(System.in);
         boolean b = false;
        while (b != true) {

            System.out.println("Check the occurance for any small alphbates from a to z.");

            System.out.println("Enter your choice: \nPress 1: to enter a alphabate and check it's occurance \nPress 2: to exit \nPress 3 to reload");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    //fetching
                    System.out.println("Enter alphabate");
                    String str = sc.next();
                    char ch = str.charAt(0);
                    int num = ch-97;
                    int ocurance = arr[num];
                    System.out.println("\n\n\n The occurance of " + str + " is " + ocurance + " times. \n\n\n");
                    break;
                }
                case 2 -> {
                    System.out.println("\n\n\nThanks for using the hashing.\n\n\n");
                    b = true;
                    break;
                }
                case 3 -> {
                    System.out.println("\n\n\nReloading...\n\n\n");
                    break;
                }
                default -> {
                    System.out.println("\n\n\nChoose elements form the array and then ask for it.\n\n\n");
                    break;
                }
            }

        }
    }
}
