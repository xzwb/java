import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("yyf", 18, "15389237357", "kxd", "xzwb@qq.com"); 
        Student student2 = new Student("yyf1", 18, "15389237358", "kxd", "xzwb1@qq.com"); 
        Student student3 = new Student("yyf2", 18, "15389237359", "kxd", "xzwb2@qq.com"); 
        Student student4 = new Student("yyf3", 18, "15389237351", "kxd", "xzwb3@qq.com"); 
        Student student5 = new Student("yyf4", 18, "15389237352", "kxd", "xzwb4@qq.com"); 
        Student student6 = new Student("yyf5", 18, "15389237353", "kxd", "xzwb5@qq.com");
        StudentCollection collection = new StudentCollection();
        collection.add(student6);
        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        collection.add(student4);
        collection.add(student5);
        Student xzwb = collection.selectWithName("yyf1");
        System.out.println(xzwb.getEmail());
    }
}

public class Student {
    private int age;
    private String name;
    private String phone;
    private String address;
    private String email;
    
    public Student(String name, int age, String phone, String address, String email) {
        this.name = name;
        if (age >= 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄设置错误!!!");
            this.age = 0;
        }
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }

    public String address() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("年龄设置错误!!!");
            this.age = 0;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void eat() {
        System.out.println(name + "正在吃");
    }

    public void sleep() {
        System.out.println(name + "正在睡");
    }

    public void play() {
        System.out.println(name + "正在玩");
    }
}

public class StudentCollection {
    private Student[] students;
    private int next;

    public StudentCollection(int index) {
        students = new Student[index];
        this.next = 0;
    } 

    public StudentCollection() {
        this(1);
    }

    public void add(Student student) {
        if (next == students.length) {
            students = Arrays.copyOf(students, students.length*2);
        }
        students[next++] = student;
    }
    
    public Student selectWithName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student selectWithPhone(String phone) {
        for (Student student : students) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }
}
