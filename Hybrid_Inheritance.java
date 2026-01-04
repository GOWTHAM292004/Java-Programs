public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.book();
        c1.phone();
        System.out.println("");
        c2.bat();
        c2.phone();
        System.out.println("");
        Child2_son son=new Child2_son();
        son.phone();
        son.bat();
        son.ball();
    }
}
class Parents{
    void phone(){
        System.out.println("Parent' Phone");
    }
}
class Child1 extends Parents{
    void book(){
        System.out.println("1st Child's Book");
    }
}
class Child2 extends Parents{
    void bat(){
        System.out.println("2nd Child's Bat");
    }
}

class Child2_son extends Child2{
    void ball(){
        System.out.println("2nd Child Son's Ball");
    }
}