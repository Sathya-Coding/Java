public class binarysearchrecursive {
    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return binarySearch(arr, mid + 1, high, key);
        else
            return binarySearch(arr, low, mid - 1, key);
    }

    public static void main(String[] args) {
        int[] data = {5, 15, 25, 35, 45};
        int key = 25;
        int result = binarySearch(data, 0, data.length - 1, key);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}
