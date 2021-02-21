package day17;

public class MyStack {
    private Object[] elements;
    private int index;

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

    public MyStack() {
    }

    public MyStack(Object[] elements) {
        this.elements = elements;
        this.index = index;
    }
    public void push(Object obj) throws MyStackOperationException{
        if (index >= elements.length-1){
            MyStackOperationException e = new MyStackOperationException("压栈失败，栈已满。");
            throw e;
        }
        index++;
        elements[index] = obj;
        System.out.println("压栈"+obj+"成功，栈桢指向"+index);
    }
    public void pop() throws MyStackOperationException{
        if (index<0){
            MyStackOperationException e = new MyStackOperationException("弹栈失败，栈已空");
            throw e;
        }
        System.out.print("弹栈"+elements[index]+"成功，");
        index--;
        System.out.println("栈帧指向"+index);
    }
}
