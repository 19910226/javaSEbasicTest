package day0804;

import java.util.Scanner;

//某个公司采用公用电话传递数据，数据是四位的整数
// 在传递过程中是加密的，加密规则如下：
// 每位数字都加上5,然后用和除以10的余数代替该数字
// 再将第一位和第四位交换，第二位和第三位交换。
public class Test6 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int ge=num%10;
       int shi=num/10%10;
       int bai=num/100%10;
       int qian=num/1000%10;
      ge=(ge+5)%10;
      shi=(shi+5)%10;
      bai=(bai+5)%10;
      qian=(qian+5)%10;
      int result=ge*1000+shi*100+bai*10+qian;
        System.out.println(result);




            

    }
}
