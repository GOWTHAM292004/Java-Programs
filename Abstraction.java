public class Abstraction {
    public static void main(String[] args) {
           using_Abstract obj=new using_Abstract();
           obj.Studentname();
           obj.Studentage();
           obj.Studentmark();
    }
}

class using_Abstract extends demo_Abstract{
   @Override
    public void Studentname(){
            System.out.println("Surya");
    }
    @Override
    public void Studentage(){
            System.out.println(21);
    }
    @Override
    public void Studentmark(){
            System.out.println(98);
    }
}
abstract class demo_Abstract{
    abstract public void Studentname();
    abstract public void Studentage();
    abstract public void Studentmark();
}
