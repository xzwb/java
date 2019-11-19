import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Person teacher = new Person("xzwb", "520520cw...", "1478863479");
        System.out.println("账号:" + teacher.getAccount());
        System.out.println("姓名:" + teacher.getName());
        if (teacher.judgePassword("520520cw...")) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
        
        if (teacher.judgePassword("520520c..")) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }

        if (teacher.login("1478863479", "520520cw...")) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
    }
}

interface Login {
    public boolean login(String account, String password);
    public boolean judgePassword(String password);
    public boolean judgeAccount(String account);
}

public class Person implements Login {
    private String name;
    private String password;
    private String account;
    
    public Person(String name, String password, String account) {
        this.name = name;
        this.password = password;
        this.account = account;
    }

    public Person() {
        this(null, null, null);
    }

    public String getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public boolean judgePassword(String password) {
        return password.equals(this.password);
    }

    public boolean judgeAccount(String account) {
        return account.equals(this.account);
    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            setPassword(newPassword);
            return true;
        } else {
            return false;
        }
    }

    public boolean login(String account, String password) {
        return (judgePassword(account) && judgePassword(password));
    }
}

public class Student extends Person {
    private String    
}
