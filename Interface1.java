
abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks bow bow!");
    }
}

  
class Main {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
