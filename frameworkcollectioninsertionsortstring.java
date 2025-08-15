public class frameworkcollectioninsertionsortstring{
        public static void main(String[] args) {
            String[] arr = {"banana", "apple", "orange", "grape"};

            for (int i = 1; i < arr.length; i++) {
                String key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = key;
            }

            System.out.print("Sorted Strings (Insertion Sort): ");
            for (String str : arr) {
                System.out.print(str + " ");
            }
        }
    }


