package day0810;
/** 
 * @author ����
 * @since 2019.08.09
 * @version 1.0
 */
//����һ������Point������2����Ա����x��y�ֱ��ʾx��y���꣬
//2��������Point()��Point(intx0,y0),
//�Լ�һ��movePoint��int dx,int dy)����ʵ�ֵ��λ���ƶ�
//����������Point����p1��p2���ֱ����movePoint�����󣬴�ӡp1��p2�����ꡣ
public class Point {
    int x; 
    int y;
    public Point(){}
	public Point(int x0, int y0) {
		this.x = x0;
		this.y = y0;
	}
	public void movePoint(int dx,int dy) {
		x=dx+10; y=dy+20;
	   
	    System.out.println("x�ƶ���λ��:"+x+"y�ƶ���λ��:"+y);
	}
    
    
}
