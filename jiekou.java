public class Main {
    public static void main(String[] args) {
        Killer killer = new Killer("jacke", 18);
        killer.gunKill();
        killer.knifeKill();
        killer.duKill();
    }
}

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Killer extends Person implements GunKill, KnifeKill, DuKill {
    public Killer(String name, int age) {
        super(name, age);
    }

    public void gunKill() {
        System.out.println("砰!!!!!!!!!");
    }

    public void knifeKill() {
        System.out.println("chua!!!!");
    }

    public void duKill() {
        System.out.println("呜.........");
    }

}

public interface GunKill {
    void gunKill();
}

public interface KnifeKill {
    void knifeKill();
}

public interface DuKill {
    void duKill();
}

