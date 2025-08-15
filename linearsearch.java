public class linearsearch {
    public static int linearSearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        int result = linearSearch(data, key);
        System.out.println(result != -1 ? "Found at index " + result : "Not Found");
    }
}

