public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7 };
        int n = 13;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                n--;
            }
        }
        System.out.println(n);
    }
}
