package day21;

import java.io.Serializable;

public class User  implements Serializable {
    /**
     * transient关键字表示游离，不参与序列化
     * 在本例中，name不参与序列化
     * 写入transient后，name将为null
     * 此处的null只是代表写入user中的name字段为null，调用add()方法时，uesr对象依然有值
     * 注意加以区分
     */
    /**
     * 最好手动生成序列号
     *     private static final long serialVersionUID = 2l;
     *     手动序列号 推荐使用
     *     如果不手动实现，则无法对类进行二次重构
     */
    private static final long serialVersionUID = 2l;
    private int no;
    private transient String name;

    public User() {
    }

    public User(int no, String name) {
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
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
