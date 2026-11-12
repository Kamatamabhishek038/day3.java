abstract class Animal{
    abstract void sound();
    abstract void behaviour();
    void color(){
        System.out.println("color of animal is white");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
    void behaviour(){
        System.out.println("rude");
    }
    void color(){
        System.out.println("Black");
        super.color();
    }

}

class Main{
    public static void main(String[]args){
        Dog d = new Dog();
        d.sound();
        d.behaviour();
        d.color();
    }
}