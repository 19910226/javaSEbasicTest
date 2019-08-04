package day0804;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {//先确定5行5列
           if(i>0&&i<4){//打印出空的地方
              for(int j=0;j<5;j++){//打印列
                     if(j==0|j==4){//打印第一列和最后一列
                         System.out.print("*");
                   }else if(j>=1&&j<=4){//中间三列
                        System.out.print(" ");
                    }
                    }
                }else if(i==0|i==4){
               for (int k = 0; k <5 ; k++) {
                   System.out.print("*");
              }
           }
         System.out.println("");
    }


    }
}
