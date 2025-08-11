import java.util.Scanner;

public class stringcontains {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String inputstring=scanner.nextLine();
        System.out.println("Enter the finding word" +"");
        String substring=scanner.nextLine();
        if(inputstring.contains(substring)){
            System.out.println("The string is found");
        }
        else{
            System.out.println("The String is Not Found");
        }
    }
}
