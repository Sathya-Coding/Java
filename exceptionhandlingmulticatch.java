public class exceptionhandlingmulticatch {
    public static void main(String[]args){
        int num1=10;
        int num2=0;
        String S="Text";
        int index=10;
        try{
            int result=num1/num2;
            char text=S.charAt(index);
            System.out.println("Result of division"+result);
            System.out.println("character of text"+text);
        }
        catch (ArithmeticException a){
            System.out.println("cannot divided by zero");
        }
        catch (StringIndexOutOfBoundsException s){
            System.out.println("Error:Invalid for String");
        }
        System.out.println("execution completed");

    }

}
