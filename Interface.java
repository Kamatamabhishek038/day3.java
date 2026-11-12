interface Rbi{
    void amount();

}
class Sbi implements Rbi{
    public void amount(){
        System.out.println("amount is nill");
    }
}
class Main{
    public static void main(String[]args){
        Sbi s= new Sbi();
        s.amount();
    }
}