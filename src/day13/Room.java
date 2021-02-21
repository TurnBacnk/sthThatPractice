package day13;

import java.util.Objects;

/**
 * 酒店的房间
 */
public class Room {
    private int no;
    private String type;
    private boolean status;

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //IDEA公爵对于boolean类型的变量，生成的get方法是isxxx();
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no && status == room.status && type.equals(room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, type, status);
    }

    @Override
    public String toString() {
        return "Room{" +
                "no=" + no +
                ", type='" + type + '\'' +
                ", status=" + (status ? "空闲" : "占用")+
                '}';
    }
}
