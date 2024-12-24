package Packages;

class Base {
    
    public String name = "Base";
    public final int id = 5323;
    protected boolean isDefined = true;
    public int age=20;
}

class Derived extends Base {

    int id = 123;
    String age="10";
    public void info() {

        System.out.println("This is Derived class");
        System.out.println("Members inherited:");
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.isDefined);
    }
}

public class AccessModifiers {

    public static void main(String[] args) {

        Derived drv = new Derived();
        drv.info();
    }
}
