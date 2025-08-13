interface printable{
    void print();
}
class Document implements printable{
    public void print(){
        System.out.println("Printing a document");
    }
}
public class interfaces {
    public static void main(String[]args){
        Document d=new Document();
        d.print();
    }
}
