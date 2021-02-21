package HeroChoseMethod;

/**
 * 此项目仅用于练习构造器，继承，setter and getter方法
 */
public class ChoseHero {
    public static void main(String[] args) {
        java.util.Scanner s=new java.util.Scanner(System.in);
        System.out.print("plz input your name：");
        String name=s.next();
        System.out.print("plz choose your location：");
        String line=s.next();
        System.out.print("plz chooose your hero:");
        String hero=s.next();
        Player p1= new Player(name,line);
        BadLine heroBeChoosed=new BadLine(hero,"割裂","阿托斯",1356777);//应定义为static类型
        p1.choose(heroBeChoosed);//此处为继承
        System.out.println(p1.getName()+"在"+p1.getLine()+"选择了"+heroBeChoosed.heroName);
        System.out.println(p1.getName());
        System.out.println(p1.getLine());

    }
}
