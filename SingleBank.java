class Rbi{
    void name(){
        System.out.println("Loan in Rbi");
    }
}
class Sbi extends Rbi{
    Sbi(){
        System.out.println(" Loan in sbi");
    }
}
class Loan{
    public static void main(String[]args){
    Sbi s= new Sbi();
    s.name();
    }
}