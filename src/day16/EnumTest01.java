package day16;

public class EnumTest01 {
    public static void main(String[] args) {
        boolean retValue = divided(10,2);
        System.out.println(retValue ? "计算成功":"计算失败");
        boolean retValue2 = divided(10,0);
        System.out.println(retValue2 ? "计算成功":"计算失败");
    }
    public static boolean divided(int a,int b)
    {
        try {
            int c =a/b;
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

