import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i = 0;
        while (i < size) {
            arr[i] = sc.nextInt();
            i += 1;
        }
        size = size - 1;
        obj.Bubble(arr, size);
    }

    public void Bubble(int arr[], int size) {
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
