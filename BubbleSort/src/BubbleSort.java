public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {5, 4, 3, 2, 1};
        int size = arr.length - 1;
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
        for (int z = 0; z <= size; z++) {
            System.out.println(arr[z]);
        }
    }
}
