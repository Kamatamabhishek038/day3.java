class Rbi{
    void loan(){
        System.out.println("Loan in Rbi");
    }
}
class Sbi extends Rbi{
    Sbi(){
        System.out.println(" Loan in sbi");
    }
}
class User extends Sbi{
    User(){
        System.out.println(" Loan for User");
    }
}
class Hdfc extends Rbi{
    Hdfc(){
        System.out.println(" Loan in Hdfc");
    }
}
class Main{
    public static void main(String[]args){
    User u=new User();
    u.loan();

    }
}




