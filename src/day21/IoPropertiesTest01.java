package day21;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * IO和Properties的联合应用
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws IOException {
        /*
        properties是一个Map集合，key和value都是String类型
        将userinfo中的数据加载到properties对象中
         */
        //新建输入流对象
        FileReader reader = new FileReader("src/day21/userinfo.properties");

        //新建一个map集合
        Properties properties = new Properties();

        //调用Properties对象中的load方法将文件中数据加载到map
        properties.load(reader);

        //调用getProperty()
        String username= properties.getProperty("username");
        System.out.println(username);

        String username2=properties.getProperty("password1");
        System.out.println(username2);

        //set集合遍历 迭代set
        for(Object s : properties.keySet()){
            System.out.println(s+"--------->"+properties.get(s));
        }

        //通过Entry遍历，即迭代Entry
        for( Map.Entry<Object, Object> entry : properties.entrySet() ){
            System.out.println(entry);
        }
    }
}
