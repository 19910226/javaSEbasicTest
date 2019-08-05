package day0804;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
       // 统计字符串“统计一个字符在字符串中的所有位置”中字符 '字'出现的所有位置
        String s="统计一个字符在字符串中的所有位置";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符");
        String c=sc.next();
        char d=c.charAt(0);
        //创建一个数组，用来重放字符
        byte[] a={};
        for (int i = 0; i <s.length() ; i++) {
            char b=s.charAt(i);
            if(d==b){
                //数组扩容
                a=Arrays.copyOf(a,a.length+1);
                a[a.length-1]=(byte)i;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
