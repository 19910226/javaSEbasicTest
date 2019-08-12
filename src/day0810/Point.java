package day0810;
/** 
 * @author 鹏飞
 * @since 2019.08.09
 * @version 1.0
 */
//定义一个点类Point，包含2个成员变量x、y分别表示x和y坐标，
//2个构造器Point()和Point(intx0,y0),
//以及一个movePoint（int dx,int dy)方法实现点的位置移动
//，创建两个Point对象p1、p2，分别调用movePoint方法后，打印p1和p2的坐标。
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
	   
	    System.out.println("x移动的位置:"+x+"y移动的位置:"+y);
	}
    
    
}
