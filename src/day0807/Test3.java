package day0807;

import java.awt.Point;

//练习 2：实现圆（Circle）类

//圆（Circle）类包含圆心（Point p）和半径（int r）两个属性
//提供合理的构造器
//提供方法：
// 计算当前图形的面积
// 计算当前图形是否包含(contains(Point))指定的点
//重载方法 contains(int x, int y) 图形是否包含坐标x,y
public class Test3 {
 public static void main(String[] args) {
	 Point p = new Point(1, 1);
	 Circle circle = new Circle(1, p);
	 //测试在圆外还是院内
	 Point point = new Point(1, 2);
	     boolean c = circle.contains(point);
	 System.out.println(c); 
 }
	
}
class Circle{
	Point p;
	int r;
	public Circle(int r,Point p) {
		this.r=r;
		this.p=p;
		
	};
	public double area() {
     return Math.PI*r*r;
    
	}
	 public boolean contains(Point p1) {
		 Point point=new Point(1,1);
		 double length = Math.sqrt(Math.pow((this.p.x-p1.x),2)+Math.pow((this.p.y-p1.y),2));
		 if(length <= r) {
			 return true;
		 }else {
			 return false;
		 }
	 }
}
