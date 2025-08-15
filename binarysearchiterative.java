public class binarysearchiterative {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 40;
        int result = binarySearch(data, key);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }

}
