public class arraySwap {

    public static void swap(int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        swap(arr, 0, 4);

        int[] two = arr;
        two[2] = 300;
        
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        

    }
}
