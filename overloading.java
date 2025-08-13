public class overloading {
    void show(int a){
        System.out.println("Integer:"+a);
    }
    void show(String s){
        System.out.println("String:"+s);
    }
    public static void main(String[]args){
        overloading d=new overloading();
        d.show(100);
        d.show("Sathya");

    }
}
