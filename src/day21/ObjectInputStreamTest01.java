package day21;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 单个对象的反序列化，方法为new一个ObjectInputStream对象，通过他的含参构造方法
 * 向内部传输一个字节流FileInputStream()对象，也通过new对象的方法
 * 向其内部输入"name"文件名
 *
 * 下面调用objectInputStream的readObject()方法，返回一个object类型的值
 * 输出object
 * 完成反序列化过程
 *
 * 多对象的反序列化过程参考单对象，其实现细节主要区分在数组的遍历，详细见test02
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student"));

        Object object = objectInputStream.readObject();
        System.out.println(object);

    }
}
