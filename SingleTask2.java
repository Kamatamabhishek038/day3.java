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
class Hdfc extends Rbi{
    Hdfc(){
        System.out.println(" Loan in Hdfc");
    }
}
class Main{
    public static void main(String[]args){
    Sbi s= new Sbi();
    s.name();
    Hdfc h= new Hdfc();
    h.name();

    }
}