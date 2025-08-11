public class stringrowsum {
    public static void main(String[]args){
        int row[][]={{2,3,5},{5,3,7},{2,8,3}};
        for(int i=0;i<row.length;i++){
            int sum=0;
            for(int j=0;j<row[i].length;j++)
            sum+=row[i][j];
            System.out.println("The sum of row "+(i+1)+":"+sum);
        }
    }
}
