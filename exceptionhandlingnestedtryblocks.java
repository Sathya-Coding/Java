import java.util.Scanner;

public class exceptionhandlingnestedtryblocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr={10,20,30};
        System.out.println("Enter the array index");
        int index = scanner.nextInt();
        System.out.println("Enter a numerator");
        int numerator = scanner.nextInt();
        System.out.println("Enter a denominator");
        int denominator = scanner.nextInt();
        try {
            System.out.println("Inside outer try block");
            int element = arr[index];

            try {
                System.out.println("Inside the inner block");
                int result = numerator / denominator;
                System.out.println("Result of division" + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception caught" + e.getMessage());
            }
            System.out.println("Array at the elements" + index + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound caught"+e.getMessage());

        }
    }
}

