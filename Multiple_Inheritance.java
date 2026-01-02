public class Multiple_Inheritance {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.phone();
        obj.cookie();
        obj.toy();
    }   
}
interface Dad{
    void phone();
}

interface Mom{
    void cookie();
}
class Son implements Dad,Mom{
    public void phone(){
        System.out.println("Dad's Phone");
    }
    public void cookie(){
        System.out.println("Cookie made by mom");
    }
    void toy(){
        System.out.println("Son's Toy");
    }
}
