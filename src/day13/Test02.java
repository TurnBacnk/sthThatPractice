package day13;


public class Test02 {
    private Object[] elements ;
    private  int index;

    public Test02() {
        index=-1;
        this.elements= new Object[10];
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void push(Object obj)
    {
        if(index>=elements.length-1)
        {
            System.out.println("栈已满");
            return;
        }
        index++;
        elements[index]=obj;
        System.out.println("压栈"+obj+"成功，栈桢指向"+index);
    }
    public void pop()
    {
        if (index<0)
        {
            System.out.println("弹栈失败，栈已空");
            return;
        }
        System.out.print("弹栈"+elements[index]+"成功，");
        index--;
        System.out.println("栈帧指向"+index);
    }
}
