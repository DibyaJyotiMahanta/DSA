/*it is named after the nature of bubble in water, take the heaviest element to the last of an
 * array and the less heavier before it and like that most lighest element at the beginning
 * of the array [it compares pair wise]
 */

//one loop runs for how many comparisons will happen
//second loop is compare each pair and change the positions
public class bubbleSort {
    public static void main(String[] args){
    int arr[] = {5,3,8,1,2,9};
    for(int j = 0; j<arr.length-1; j++){
    for(int i = 0; i<arr.length-2;i++){
        int temp;
       if(arr[i]>arr[i+1]){
        temp = arr[i];
        arr[i]=arr[i+1];
        arr[i+1] = temp;
       }
    }
    }
    for(int i :arr){
        System.out.println(i);
    }

    }
    
}
