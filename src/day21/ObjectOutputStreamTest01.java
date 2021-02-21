package day21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 单个对象序列化
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        Student stu = new Student(111,"zhangsan");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student"));
        objectOutputStream.writeObject(stu);

        objectOutputStream.flush();

        objectOutputStream.close();
    }
}
