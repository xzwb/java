import java.util.*;
import java.io.*;

public class Main { 
    public static String[][] pieces = new String[25][25];
    
    public static int round = 0;

    public static void start(String[][] pieces) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 25; j++) {
                pieces[i][j] = "+";
            }
        }
    }

    public static boolean isEmpty(String[][] pieces, int row, int col) {
        return pieces[row][col] == "+";
    }

    public static void main(String[] args) {
        start(pieces);
        print(pieces);
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        while ((round == 0) || (!judge(pieces, round))) {
            System.out.println("输入行号:");
            row = scanner.nextInt();
            System.out.println("输入列号:");
            col = scanner.nextInt();
            while (!isEmpty(pieces, row, col)) {
                System.out.println("重新输入行号:");
                row = scanner.nextInt();
                System.out.println("重新输入列号:");
                col = scanner.nextInt();
            }
            round++;
            if (round % 2 == 0) {
                pieces[row][col] = "#";
            } else {
                pieces[row][col] = "&";
            }
            clear();
            print(pieces);
        }
        if (round % 2 == 0) {
            System.out.println("后手方胜");
        } else {
            System.out.println("先手方胜");
        }
    }

    public static void clear() {
        try {
            Process pro = Runtime.getRuntime().exec("clear");
            pro.waitFor();
            InputStreamReader ir = new InputStreamReader(pro.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            String line;
            while((line = input.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    } 

    public static void print(String[][] pieces) {
        System.out.print("  ");
        for (int i = 0; i < 25; i++) {
            if (i <= 10) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < 25; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j < 25; j++) {
                System.out.print(pieces[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static boolean judge(String[][] pieces, int round) {
        if (round % 2 == 1) {
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {
                    if (pieces[i][j] == "&") {
                        if (count(pieces, i, j, "&")) {
                           return true;
                        }
                    }
                }
            }
            return false;
        } else {
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {
                    if (pieces[i][j] == "#") {
                        if (count(pieces, i, j, "#")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }       
    }
    
    // 垃圾代码..............................
    public static boolean count(String[][] pieces, int row, int col, String piece) {
        int cont = 0;
        int trow = row;
        int tcol = col;
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            trow--;
        }
        if (cont < 5) { 
            trow = row+1; 
        } else { 
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece)  {
            cont++;
            trow++;
        }
        if (cont < 5) { 
            trow = row; 
            cont = 0;
        } else {
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            tcol--;
        }
        if (cont < 5) { 
            tcol = col+1;
        } else {
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece)  {
            cont++;
            tcol++;
        }
        if (cont < 5) { 
            tcol = col; 
            cont = 0;  
        } else {
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            tcol++;
            trow++;
        }
        if (cont < 5) {
            tcol = col+1; 
            trow = row+1;  
        } else {
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            tcol--;
            trow--;
        }
        if (cont < 5) { 
            tcol = col+1; 
            trow = row+1;
            tcol = col; 
            trow = row; 
            cont = 0;
        }else { 
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            tcol--;
            trow++;
        }
        if (cont < 5) { 
            tcol = col+1; 
            trow = row-1; 
        } else {
            return true;
        }
        while (trow < 25 && tcol < 25 && trow >= 0 && tcol >= 0 && pieces[trow][tcol] == piece )  {
            cont++;
            tcol++;
            trow--;
        }
        if (cont < 5) { 
            return false; 
        } else {
            return true;
        }
    }
}
