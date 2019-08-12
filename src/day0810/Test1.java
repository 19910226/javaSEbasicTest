package day0810;

import java.util.Arrays;
import java.util.Scanner;

/**
* @ClassName: Test1
* @Description: 学生管理系统
* @author pf
* @date 2019年8月10日 下午3:30:24
*
*/
 class Student {
	String name;
	int id;
	char sex;
	int age;
	String grade;
	String address;
	String num;
	String emial;
	public Student() {}
	public Student(String name, int id,char sex,  int age, String grade, String address, String num, String emial) {
		
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.num = num;
		this.emial = emial;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", address=" + address + ", num=" + num + ", emial=" + emial + "]";
	}
	
}

public class Test1 {
    static	Student student2=new Student("张三",3,'男',100,"中级","北京市昌平区","123456789122","zhangsan@qq.com");
    static	Student[] students= {student2};
	
	public static void main(String[] args) {
		log();
		
	}
     //登陆界面
	public static void log() {
	   Scanner sc= new 	Scanner(System.in);
	   System.out.println("请选择");
	     int number = sc.nextInt();
	    
	     switch (number) {
		case 1:
			 System.out.println("用户请登录");
			 start();
			
			break;
		case 2:	
		      System.out.println("用户退出界面");
		      file();
		    break;  
		    
		default:
			 System.out.println("输入错误请重新输入");
			 log();
			break;
		}
	}
	public static void start() {
		String a="admin";
		String p="admin";
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("请输入用户名");
	     String account  = scanner.next();
	     
	     System.out.println("请输入密码");
	     String password=scanner.next();
	     if(account.equals(a)&&password.equals(p)) {
	    	 System.out.println("用户登录成功");
	    	 choice();
	     }else {
	    	 System.out.println("登陆失败，请重新登陆");
	    	 log();}
	}
	//选择操作信息
	public static void choice() {
	   Scanner c = new Scanner(System.in) ;
	   System.out.println("请选择操作信息");
	 int n = c.nextInt();
	 switch (n) {
	   case 1:
	//请查看学生信息
		 show();
		break;
	   case 2:
		   //添加学生信息
		   add();
		   
		break; 
	   case 3:
		   System.out.println("删除学生信息");
		   delete();
		break;
	   case 4:
		   //修改学生信息
		   update();
		break; 
	   case 5:
		   System.out.println("1.查看所有学生信息，2.根据id查看学生信息，3.根据id查询学生姓名，4.返回上一层");
		   showId();
	default:
		System.out.println("请退出");
		break;
	}
	}
	//添加学生信息
	public static void add() {
//String name, int id, String sex, int age, String grade,
//		String address, String num, String emial)		
		//构建学生信息
	       Scanner st= new	Scanner(System.in);
	       System.out.println("请添加学生信息");
	       System.out.println("请添加学生姓名");
	        String name= st.next();
	        System.out.println("您添加学生姓名:"+ name);
	        System.out.println("请添加学生id");
		    int id=st.nextInt();
		    System.out.println("您添加学生id:"+id);
		    System.out.println("请添加学生性别");
		    char sex=st.next().charAt(0);
		    System.out.println("您添加学生性别:"+ sex);
		    System.out.println("请添加学生年龄");
		   int age=st.nextInt();
		    System.out.println("您添加学生年龄:"+ age);
		    System.out.println("请添加学生年级");
		   String grade=st.next();
		    System.out.println("您添加学生年级:"+ grade);
		    System.out.println("请添加学生地址");
		    String address=st.next();
		    System.out.println("您添加学生地址:"+ address);
		    System.out.println("请添加学生联系方式");
		   String num=st.next();
		    System.out.println("您添加学生联系方式:"+ num);
		    System.out.println("请添加学生邮箱");
		    String emial=st.next();
		    System.out.println("您添加学生邮箱:"+emial);
		    Student student1 = new	Student();
//		    Student student2=new Student("张三",3,'男',100,"中级","北京市昌平区","123456789122","zhangsan@qq.com");
		    student1.name=name;
		    student1.id=id;
		    student1.sex=sex;
		    student1.age=age;
		    student1.grade=grade;
		    student1.address=address;
		    student1.num=num;
		    student1.emial=emial;
//		    Student[] students= {student2};
//数组扩容
			students=Arrays.copyOf(students,students.length+1 );
		    students[1]=student1;
		    if(students[1] == null) {
		    	System.out.println("添加失败，请重新添加");
		    }System.out.println("添加成功,请查看学生信息");
		    
		    show();
		  }
	//查看学生信息
	public static void show() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}System.out.println("根据id修改学生年龄");
		update();
	}
	//根据id修改学生信息
	public static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要修改的角色的id:");
		int  id = scanner.nextInt();
		System.out.println("请输入修改的年龄:");
		int age1 = scanner.nextInt();
		for(int i=0;i<students.length;i++) {
			if(students[0].id==id) {
				// 做修改操作
				students[0].age = age1;
				System.out.println("修改成功");
				System.out.println("修改后的信息:"+students[i]);
			}
		}
		start();
	}
	//根据id查看学生信息
	public static void showId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的id:");
		int  id = scanner.nextInt();
		for(int i=0;i<students.length;i++) {
			if(students[i].id==id) {
				System.out.println(students[i]);
			}
		}
		choice();
	}
	//删除学生信息
	public static void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要删除的学生地标:");
		String name= scan.next();
		for(int i=0;i<students.length;i++) {
			if(students[i].name.equals(name)) {
				students[i] = students[students.length-1];
				students = Arrays.copyOf(students, students.length-1);
			}
		}
		System.out.println("删除后的信息:"+Arrays.toString(students));
	start();
	}
	//退出界面
	public static void file() {
		System.exit(0);
	}
	
	}

