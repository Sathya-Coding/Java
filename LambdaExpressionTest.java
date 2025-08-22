public class LambdaExpressionTest {
    public static void main(String[]args){
        Runnable r=()->System.out.println("Hello from Lambda");
        new Thread(r).start();
    }
}
