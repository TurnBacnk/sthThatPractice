package day13;

import java.util.Scanner;

/**
 * 为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态等功能
 *      1、该系统的用户是酒店前台
 *      2、酒店中的每一个房间应该是一个java对象：Room
 *      3、酒店使用一个二维数组Room[][] rooms;
 *      4、每一个房间Room应该有：房间编号、房间类型、房间是否空闲
 *      5、系统对外应该提供的功能：
 *          可以预定房间：用户输入房间编号，订房
 *          可以退房：用户输入房间编号，退房
 *          可以查看所有房间的状态，用户输入某个指令应该可以查看所有房间的状态
 */
public class HotelMgtSystem {
    public static void main(String[] args) {

        Room room[][] = new Room[3][10];
        Hotel hotel = new Hotel(room);
        //hotel.print();

        System.out.println("欢迎使用酒店管理系统，请认真阅读以下说明");
        System.out.println("请输入对应的功能编号：【1】表示查看房间列表。【2】表示订房。【3】表示退房。【0】表示退出本系统");
        Scanner s = new Scanner(System.in);

        for (;true;)
        {
            System.out.println("请输入功能编号");
            int i = s.nextInt();
            if (i==1)
            {
                hotel.print();
            }
            else if (i==2)
            {
                System.out.println("请输入房间编号：");
                Scanner j = new Scanner(System.in);
                int roomNo = j.nextInt();
                hotel.order(roomNo);
                System.out.println("room"+roomNo+"订房成功");
            }
            else if (i==3)
            {
                System.out.println("请输入房间编号：");
                Scanner j = new Scanner(System.in);
                int roomNo = j.nextInt();
                hotel.exit(roomNo);
                System.out.println("room"+roomNo+"退房成功");
            }
            else if (i==0)
            {
                return;
            }
            else
            {
                System.out.println("输入非法");
            }
        }
    }
}
/*
* 该程序目前存在的问题，对于已经是占用的房间仍然可以订房，对于空闲房间仍可以退房
*
*
* */
