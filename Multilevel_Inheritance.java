public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Son obj=new Son(); 
        obj.Pen();
        obj.phone();
        obj.toy();       
    }
}

class GrandFather{
    void Pen(){
        System.out.println("Grand Father's pen");
    }
}

class Dad extends GrandFather{
    void phone(){
        System.out.println("Dad's Phone");
    }
}
class Son extends Dad{
    void toy(){
        System.out.println("Son's Toy");
    }
}


