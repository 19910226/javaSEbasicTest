package demo1;

public class Test1 {
    public static void main(String[] args) {
        String nums="692116851128";
        //奇数位上的数的和
        int oldNum=0;
        //偶数位上的数 的和
        int evenNum=0;
        for(int i=0;i<nums.length();i++){
            if(i%2==0){
                oldNum=oldNum+nums.charAt(i)-'0';
            }else{
                evenNum=evenNum+nums.charAt(i)-'0';
            }

        }
        char v=65;
        char c='2';

        System.out.println(c);
        System.out.println(v);




        char b='中';
        System.out.println(b);
    }
}
