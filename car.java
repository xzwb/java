public class Car {
    // 颜色
    String color; 
    // 牌子
    String pinPai;
    // 轮子数量
    int lunZi;
    
    void run() {
        System.out.println("一辆==" + color + "==品牌==" + pinPai + "==轮子==" + lunZi);
    }
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.color = "红色";
        car.pinPai = "bmw";
        car.lunZi = 4;
        car.run();
    }
}
