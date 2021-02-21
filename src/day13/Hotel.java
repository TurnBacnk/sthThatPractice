package day13;

public class Hotel {
    private Room[][] rooms;

    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i==0)
                {
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }
                else if (i==1)
                {
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }
                else if (i==2)
                {
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }

            }
        }
    }

    public Hotel() {

    }
    public void print()
    {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    public void order(int roomNo)
    {
        //可使用if语句添加检测输入的房间号是否正确
        rooms[roomNo/100-1][roomNo%100-1].setStatus(false);
    }

    public void exit(int roomNo)
    {
        rooms[roomNo/100-1][roomNo%100-1].setStatus(true);
    }
}
