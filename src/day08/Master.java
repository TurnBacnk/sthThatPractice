package day08;

public class Master {
    /*
    public void feed( Cat c)
    {
        c.eat();
    }
    */
    /**
     * Master和Cat、Dog这两个类型的关联程度很强，耦合度很高，扩展力差
     * 降低程序的耦合度【解耦合】，提高程序的扩展能力【软件开发的一个很重要的目标】
     *
      */
    public void feed(Pet pet )
    {
        pet.eat();
    }
}
