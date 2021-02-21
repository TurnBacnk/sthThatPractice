package LeetCodePrograming;

/**
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 解题思路：
 *  首先动态获取x的长度，根据长度对x进行取整运算，获得首位数字 放入数组
 *  将以上操作放入循环，每次对长度-1，取得次一位数字，放入数组
 *  根据长度此步骤的具体实现细节：
 *      利用Math.pow()方法
 *  循环结束后，将数组遍历并依照顺序作为个十百千万相加。
 */
public class Solution1 {
    public int reverse (int x) {
        boolean flag = false;
        if (x<0){
            x=  -x;
            flag =true;//负数为true
        }
        String num = String.valueOf(x);//将x转换为String类型
        int length =num.length();//动态获取数字长度
        List arrayList = new ArrayList();
        int temp = 0;
        int target = 0;

        //进行循环获取每一位数字
        for (int i = 1; i <= length; i++) {
            int multiple = (int) Math.pow(10,length-i);
            int num2= x/multiple;
            arrayList.add(num2);
            x = x%multiple;
        }
        for (int i = 1; i <= arrayList.size(); i++) {
            temp =(int) arrayList.get(i-1)*((int)Math.pow(10,i-1));
            target = target+temp;
        }
        if (flag){
            target = -target;
        }

    return target;
    }
}
