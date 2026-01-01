public class Single_Inheritance {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.toy();
        obj.phone();
    }
}
class Dad{
    void phone(){
        System.out.println("Dad's Phone");
    }
}
class Son extends Dad{
    void toy(){
        System.out.println("Son's Toy");
    }
}
