class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
class dog extends Animal {
        public void sound() {
            System.out.println("Dog Barks");
        }
    }

public class overridding {
    public static void main(String []args){
        Animal a=new dog();
      a.sound();
    }

}
