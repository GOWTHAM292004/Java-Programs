class Encapsulation{
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

class demo{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setname("Surya");
        obj.setage(40);
        obj.getname();
        obj.getage();
    }
}