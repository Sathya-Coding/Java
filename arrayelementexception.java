public class arrayelementexception {
    public static void main(String[]args){
        int[]numbers={10,20,30,40,50};
        try{
                System.out.println(numbers[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Index out of range");

        }
    }
}
