
import java.util.Scanner;

class Map {

    int[] map(int[] arr, int[] mapped_arr) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            mapped_arr[element] = mapped_arr[element] + 1;
        }
        return mapped_arr;
    }
}

public class Hashing {

    public static void main(String args[]) {
        int[] arr = {2, 4, 2, 1, 5, 1, 5, 3};
        int[] map_arr = new int[13];

        Map Hashset = new Map();
        int hashset[] = Hashset.map(arr, map_arr);

        boolean b = false;
        while (b != true) {

            System.out.println("Check the occurance for any number from 0 to 12");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your choice: \nPress 1: to enter a number and check it's occurance \nPress 2: to exit \nPress 3 to reload");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter num");
                    int num = sc.nextInt();
                    int ocurance = hashset[num];
                    System.out.println("\n\n\n The occurance of " + num + " is " + ocurance + " times. \n\n\n");
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
