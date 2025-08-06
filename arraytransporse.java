public class arraytransporse {
    public static void main(String[]args){
        int matrix[][]={{2,3,4},{4,5,6},{6,7,8}};
        int rows=matrix.length;
        int colm=matrix[0].length;
        int[][] transpose = new int[rows][colm];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
               transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("The transpose matrix of:");
        for(int i=0;i<rows;i++){
            for(int j=0;j< colm;j++){
                System.out.println(transpose[j][i]+"");
            }
        }
        System.out.println();
    }
}
