abstract class Bank{
    abstract void money();
    void balence(){
        System.out.println("welcome to bank");
    }
}
class Sbi extends Bank{
    void money(){
        System.out.println("loan accepted!");
    }
}

class Main{
    public static void main(String[]args){
        Sbi s = new Sbi();
        s.money();
        s.balence();
    }
}