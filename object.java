public class Main {
    public static void main(String[] args) {
        HomeBird home = new HomeBird();
        Ying yin = new Ying();
        HongHu hu = new HongHu();
        hu.fly();
        home.fly();
        yin.fly();
    }
}

public abstract class Bird {
    public abstract void fly();
}

public abstract class FlyBird extends Bird {
    // 这句话可以写也可以不写
    public abstract void fly();
}

public class Ying extends FlyBird {
    public void fly() {
        System.out.println("鹰击长空喔咕!!!");
    }
}

public class HongHu extends FlyBird {
    public void fly() {
        System.out.println("燕雀安知鸿鹄之志!!");
    }
}

public class HomeBird extends Bird {
    public void fly() {
        System.out.println("不能飞!!");
    }
}
