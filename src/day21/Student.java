package day21;

import java.io.Serial;
import java.io.Serializable;


public class Student implements Serializable {
    /**
     * idea工具自动生成序列化版本号
     */
    @Serial
    private static final long serialVersionUID = -775060919285468378L;
    private int no;
    private  String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
