package day16;

public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divided(10,2);
        System.out.println(r==Result.SUCCESS ? "计算成功":"计算失败");
    }
    public static Result divided(int a,int b)
    {
        try {
            int c =a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FASLE;
        }
    }
}
enum Result{
    SUCCESS,FASLE
}
