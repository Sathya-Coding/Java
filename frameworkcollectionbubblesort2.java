public class frameworkcollectionbubblesort2 {
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 4, 2};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // swap
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            System.out.print("Sorted Array (Bubble Sort): ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

