package day0804;
//整数反转
//public StringBuffer reverse(),将字符串反转
public class Test10 {
    public static void main(String[] args) {
        //整数反转
//public StringBuffer reverse(),将字符串反转
        int a=57567;
        //将int类型转换成string类型
        String b=String.valueOf(a);
        //将string类转换成stringbuffer
        StringBuffer c=new StringBuffer(b);
        //实现反转
        StringBuffer c1=c.reverse();
        //将stringbuffer转换为string
        String newc1=c1.toString();
        //将string转换为int类型
   int newc2=Integer.parseInt(newc1);
        System.out.println(newc2);





    }
}
