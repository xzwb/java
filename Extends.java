public class Main {
    public static void main(String[] args) {
        CoffeeCat coffeecat = new CoffeeCat("红色", "蓝色", "加菲");
        // coffeecat.color = "蓝色";
        // coffeecat.name = "加菲";
        coffeecat.eatFish();
        coffeecat.eat();
        coffeecat.sleep();
    }
}

public class Animals {
    public String name;
    public void eat() {
        System.out.println("name = " + name + " eating");
    }
    public Animals(String name) {
        this.name = name;
    }
}

public class Cat extends Animals {
    public String color;
    public void sleep() {
        System.out.println("====睡觉====");
    }
    public Cat(String color, String name) {
        super(name);
        this.color = color;
    }
}

public class CoffeeCat extends Cat {
    private String eyeColor;
    public  CoffeeCat(String eyeColor, String color, String name) {
        super(color, name);
        this.eyeColor = eyeColor;
    }
    public void eatFish() {
        System.out.println("name = " + name + ", color = " + color + ", eyecolor = " + eyeColor + ", 正在吃鱼");
    }
}
