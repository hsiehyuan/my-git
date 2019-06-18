import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter 10 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sca.nextInt();
        }
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}