// 阿姆斯特丹数

public class Main {
    public static void main(String[] args) {
        Main a = new Main(0);
        for (int i = 100; i < 1000; i++) {
            if (i == a.pow(a.getBai(i)) + a.pow(a.getTen(i)) + a.pow(a.getGe(i))) {
                a.cont++;
                System.out.print(i + " ");
            }
        }
        System.out.println(a.cont);
    }
    
    public Main(int cont) {
        this.cont = cont;
    }


    public int pow(int n) {
        return n*n*n;
    }

    public int getBai(int n) {
        return n/100;
    }

    public int getTen(int n) {
        return (n-(n/100)*100)/10;
    }

    public int getGe(int n) {
        return n%10;
    }

    public int cont;
}

