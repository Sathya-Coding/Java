public class frameworkcollectionmergesortnames {
        public static void mergeSort(String[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }
        public static void merge(String[] arr, int left, int mid, int right) {
            String[] temp = new String[right - left + 1];
            int i = left, j = mid + 1, k = 0;

            while (i <= mid && j <= right) {
                if (arr[i].compareTo(arr[j]) <= 0)
                    temp[k++] = arr[i++];
                else
                    temp[k++] = arr[j++];
            }

            while (i <= mid) temp[k++] = arr[i++];
            while (j <= right) temp[k++] = arr[j++];

            System.arraycopy(temp, 0, arr, left, temp.length);
        }

        public static void main(String[] args) {
            String[] names = {"Sathya", "Arun", "Kavi", "Bala"};
            mergeSort(names, 0, names.length - 1);

            System.out.print("Sorted Names (Merge Sort): ");
            for (String name : names) {
                System.out.print(name + " ");
            }
        }
    }


