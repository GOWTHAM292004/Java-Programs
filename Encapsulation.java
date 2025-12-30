
class Encapsulation{
    public static void main(String[] args) {
        //What is Encapsulation : Encapsulation is binding data and methods together in a single unit and hiding the internal data by making variables private and accessing them through public methods (getters and setters).
        //Encapsulation is the process of hiding data and allowing controlled access to it using methods(getter and setter).
        democlass obj=new democlass();
        obj.setname("Surya");
        obj.setage(40);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}

class democlass{
    private String name;
    private int age;
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    
}