package day0804;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
            int sum=0;
            for(int i=1;i<=100;i++){
//判断个位数是否为3，如果不为3，将当前i以及sum的和重新赋给sum
                if(!(i%10==3))
                {
                    sum+=i;
                }
            }
            System.out.println(sum);

        }
        }


