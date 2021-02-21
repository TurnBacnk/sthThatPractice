package day21;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化,多个对象反序列化
 * 此时以数组形式出现
 * 通过遍历的方式输出，也可直接输出usersList，则结果会将整个数组整体输出
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("users"));


        List<User> usersList = (List<User>) objectInputStream.readObject();
        for ( User user : usersList ){
            System.out.println(user);
        }

        objectInputStream.close();
    }
}
