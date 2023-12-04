import java.util.Arrays;
import java.util.Random;

public class shuffleArray{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        Random ran = new Random();

        for(int i=0;i<arr.length;i++){
            int randomIndexToSwap = ran.nextInt(arr.length);
            int temp = randomIndexToSwap;
            arr[randomIndexToSwap] = arr[i];
            arr[i] = temp; 
        }
        System.out.println(Arrays.toString(arr));
    }
}