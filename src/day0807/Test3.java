package day0807;

import java.awt.Point;

//��ϰ 2��ʵ��Բ��Circle����

//Բ��Circle�������Բ�ģ�Point p���Ͱ뾶��int r����������
//�ṩ����Ĺ�����
//�ṩ������
// ���㵱ǰͼ�ε����
// ���㵱ǰͼ���Ƿ����(contains(Point))ָ���ĵ�
//���ط��� contains(int x, int y) ͼ���Ƿ��������x,y
public class Test3 {
 public static void main(String[] args) {
	 Point p = new Point(1, 1);
	 Circle circle = new Circle(1, p);
	 //������Բ�⻹��Ժ��
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
