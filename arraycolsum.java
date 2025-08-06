import java.util.Scanner;

public class arraycolsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter the elements of coloumns");
        int coloumns = scanner.nextInt();
        System.out.println("Enter the matrix element");
        int matrix[][] = new int[rows][coloumns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < coloumns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++)
                sum += matrix[i][j];
            System.out.println("Sum of coloumns" + (j + 1) + ":" + sum);

        }
    }
}