class parent{
    void name(){
        System.out.println("This is a parent class");
    }
}
class child extends parent{
    child(){
        System.out.println(" This is a child class");
    }
}
class Main{
    public static void main(String[]args){
    child ch= new child();
    ch.name();
    }
}