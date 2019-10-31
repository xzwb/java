public class Main {
    public static void main(String[] args) {
        Animals animal = new Cat();
        animal.eat();
        Cat cat = new Cat();
        eat(cat);
    }
    
    // 父类可以接受子类对象
    public static void eat(Animals animal) {
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
