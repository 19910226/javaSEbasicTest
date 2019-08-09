package day0806;

import java.util.Arrays;
//选择排序
//i 代表第一个数据的位置
// j 代表后部每一个数据的位置
public class Test1 {
    public static void main(String[] args){
        int[] num={1,6,542,2447,32};
        //先取出第一个数，下标从0开始
        for (int i = 0; i <num.length-1 ; i++) {
            //取后面的数
            for (int j = i+1; j <num.length ; j++) {

                if(num[i]>num[j]){
                   int num1=num[i];
                   num[i]=num[j];
                   num[j]=num1;
                }
            }

        }
        System.out.println(Arrays.toString(num));
    }
}
