package day19;


public class GenericTest03 <asdasd>{
    public void doSome(asdasd o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("asdasd");

        GenericTest03<Integer> gt2 = new GenericTest03<>();
        gt2.doSome(123);

       MyIterator<String> mi = new MyIterator<>();
       String s1 = mi.get();
       System.out.println(s1);

       MyIterator<Animal> mi2 = new MyIterator<>();
       Animal a1 = mi2.get();
       System.out.println(a1);
    }
}
class MyIterator<T>{
    public T get(){
        return null;
    }
}
