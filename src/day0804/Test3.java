package day0804;

import java.util.Arrays;
//arr.length - 1是为了防止数据越界
// arr.length - 1 - i是为了减少比较的次数
public class Test3 {
    public static void main(String[] args) {
        int[] a={1,7,9,11,13,15,17,19};
        int[] b={2,4,6,8,10};
        int[] c=new int[a.length+b.length];
//        将一个数组a复制到c数组
        System.arraycopy(a,0,c,0,a.length);
//        再将b数组复制到c数组
        System.arraycopy(b,0,c,a.length,b.length);
        for (int i = 0; i <c.length-1 ; i++) {
            for (int j = 0; j <c.length-1-i ; j++) {
                if(c[j]>c[j+1]){
                    int num=c[j];
                    c[j]=c[j+1];
                    c[j+1]=num;
                }
            }
        }
            System.out.println(Arrays.toString(c));





    }
}
