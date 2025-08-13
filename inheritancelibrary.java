import java.util.Scanner;

class library{
    void librarydetails(){
        System.out.println("Library Management Details");
    }
}
class Book extends library{
    void librarydetails(String title,String name,int id){
        System.out.println("Book Details:");
        System.out.println("Title:"+title);
        System.out.println("Name"+name);
        System.out.println("ID"+id);
        System.out.println("----------------------");
    }
}
class Magazine extends library{
    void librarydetails(String title,String name,int id){
        System.out.println("Magazine Details:");
        System.out.println("Title:"+title);
        System.out.println("Name"+name);
        System.out.println("ID"+id);
        System.out.println("----------------------");
    }
}
class DvD extends library{
    void librarydetails(String title,String name,int id){
        System.out.println("DVD Details:");
        System.out.println("Title:"+title);
        System.out.println("Name"+name);
        System.out.println("ID"+id);
        System.out.println("----------------------");
    }
}
public class inheritancelibrary {
    public  static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Book Details");
        System.out.println("Title:");
        String title=scanner.nextLine();
        System.out.println("Name:");
        String name=scanner.nextLine();
        System.out.println("ID:");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Magazine Details");
        System.out.println("Title:");
        title=scanner.nextLine();
        System.out.println("Name:");
        name=scanner.nextLine();
        System.out.println("ID:");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter DVD Details");
        System.out.println("Title:");
        title=scanner.nextLine();
        System.out.println("Name:");
        name=scanner.nextLine();
        System.out.println("ID:");
        id=scanner.nextInt();
        scanner.nextLine();
        Book b=new Book();
        b.librarydetails(title,name,id);
        Magazine m=new Magazine();
        m.librarydetails(title,name,id);
        DvD d=new DvD();
        d.librarydetails(title,name,id);
    }
}
