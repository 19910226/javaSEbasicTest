package day0806;

import java.util.Arrays;

//冒泡排序,相邻比较
//i 代表次数
 //j 代表比较位置
public class Test2 {
    public static void main(String[] args) {
        int[] num={1,6,542,2447,32};
        num=bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }
    public static int[] bubbleSort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int num1 = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = num1;
                }

            }
        }return num;

    }
}
