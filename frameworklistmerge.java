import java.util.Arrays;

public class frameworklistmerge {
    public static void main(String[]args){
        int[]list1={1,2,3};
        int[]list2={4,5,6};
        int[]merged=new int[list1.length+list2.length];
        for(int i=0;i<list1.length;i++) {
            merged[i] = list1[i];
        }
            for(int j=0;j<list2.length;j++) {
                merged[list1.length + j] = list2[j];
            }
        Arrays.sort(merged);

            System.out.println("Merged sorted array:");
        for(int num:merged){
            System.out.println(num+"");


            }
            }

    }

