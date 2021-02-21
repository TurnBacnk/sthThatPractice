package day15;

/**
 * 获取自1970年1月1日0时0分0秒到当前系统时间的总毫秒数
 */
public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("消耗时间"+(end-begin)+"毫秒");
    }
    public static void print(){
        for ( int i = 0 ; i < 100 ; i++ ) {
            System.out.println("i="+i);//打印过程拖慢了计算器速度
        }
    }
}
