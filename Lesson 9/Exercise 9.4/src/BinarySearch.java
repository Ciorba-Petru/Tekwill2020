public class BinarySearch {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        System.out.println(java.util.Arrays.binarySearch(arr, number));
    }
}