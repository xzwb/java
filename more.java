public class Main {
    public static void main(String[] args) {
        Animals animal = new Cat();
        animal.eat();
    }
}

public abstract class Animals {
    public abstract void eat();
}

public class Cat extends Animals {
    public void eat() {
        System.out.println("猫吃鱼!!");
    }
}

public class Wolf extends Animals {
    public void eat() {
        System.out.println("狼吃羊!!");
    }
}
