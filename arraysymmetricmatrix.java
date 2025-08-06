import java.util.Scanner;

public class arraysymmetricmatrix {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int[][]matrix=new int[3][3];
        System.out.println("Enter the elements");
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean symmat=false;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if (matrix[i][j]!=matrix[j][i]){
                   symmat=true;
                   break;
               }
            }
            if (!symmat)
                break;
        }
            if(symmat)
            System.out.println("The matrix is symmatrix");
            else{
                System.out.println("The matrix is not symmatrix");
            }
        }
    }

