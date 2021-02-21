package day21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 多个对象序列化，通过数组的形式完成
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("users"));

        objectOutputStream.writeObject(userList);

        objectOutputStream.flush();

        objectOutputStream.close();
    }
}
