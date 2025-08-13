class animal{
    void eat(){
        System.out.println("This animal is eating food");
    }
}
class Dog extends animal{
    void bite(){
        System.out.println("Dog is bite the man");
    }
}
public class inheritanceexample {
    public static void main(String[]args){
        Dog dog=new Dog();
        dog.eat();
        dog.bite();
    }
}
