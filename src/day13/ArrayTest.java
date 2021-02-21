package day13;

import org.jetbrains.annotations.NotNull;

public class ArrayTest {
    public static void main(String @NotNull [] args) {
        if(args.length != 2)
        {
            System.out.println("使用该系统请输入参数，例如张三 123");
            return;
        }
        String username = args[0];
        String password = args[1];
        if ("admin".equals(username)&&"123".equals(password))//此处这种写法不会出现空指针异常
        {
            System.out.println("登录成功，欢迎【"+username+"】回来");
            System.out.println("请继续使用本系统");
        }
        else
        {
            System.out.println("输入错误");
        }
    }
}
