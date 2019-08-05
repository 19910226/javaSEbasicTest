package day0804;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        char[ ] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符");
      String a=sc.next();
      char b=a.charAt(0);

      byte[] c={};
        for (int i = 0; i < chs.length; i++) {
            if (b == chs[i]) {
                c= Arrays.copyOf(c,c.length+1);
                c[c.length-1]=(byte)i;
            }
            }
        System.out.println(Arrays.toString(c));
        }
    }

