package day06;
/**
 * 方法什么时候定义为静态
 *      方法描述的是动作，当所有的对象执行这个动作的时候，最终产生映像是一样的，
 *      那么这个动作已经不属于某一个对象的动作了，可以将这个动作提升为类级别，
 *      模板级动作
 * 静态方法中无法直接访问实例变量和实例方法
 *
 */

public class StaticTest02 {
    public static void main(String[] args) {
        MathUtil.sumInt(1,2);
    }
}
