package day0810;

import java.util.Arrays;
import java.util.Scanner;

/**
* @ClassName: Test1
* @Description: ѧ������ϵͳ
* @author pf
* @date 2019��8��10�� ����3:30:24
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
    static	Student student2=new Student("����",3,'��',100,"�м�","�����в�ƽ��","123456789122","zhangsan@qq.com");
    static	Student[] students= {student2};
	
	public static void main(String[] args) {
		log();
		
	}
     //��½����
	public static void log() {
	   Scanner sc= new 	Scanner(System.in);
	   System.out.println("��ѡ��");
	     int number = sc.nextInt();
	    
	     switch (number) {
		case 1:
			 System.out.println("�û����¼");
			 start();
			
			break;
		case 2:	
		      System.out.println("�û��˳�����");
		      file();
		    break;  
		    
		default:
			 System.out.println("�����������������");
			 log();
			break;
		}
	}
	public static void start() {
		String a="admin";
		String p="admin";
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("�������û���");
	     String account  = scanner.next();
	     
	     System.out.println("����������");
	     String password=scanner.next();
	     if(account.equals(a)&&password.equals(p)) {
	    	 System.out.println("�û���¼�ɹ�");
	    	 choice();
	     }else {
	    	 System.out.println("��½ʧ�ܣ������µ�½");
	    	 log();}
	}
	//ѡ�������Ϣ
	public static void choice() {
	   Scanner c = new Scanner(System.in) ;
	   System.out.println("��ѡ�������Ϣ");
	 int n = c.nextInt();
	 switch (n) {
	   case 1:
	//��鿴ѧ����Ϣ
		 show();
		break;
	   case 2:
		   //���ѧ����Ϣ
		   add();
		   
		break; 
	   case 3:
		   System.out.println("ɾ��ѧ����Ϣ");
		   delete();
		break;
	   case 4:
		   //�޸�ѧ����Ϣ
		   update();
		break; 
	   case 5:
		   System.out.println("1.�鿴����ѧ����Ϣ��2.����id�鿴ѧ����Ϣ��3.����id��ѯѧ��������4.������һ��");
		   showId();
	default:
		System.out.println("���˳�");
		break;
	}
	}
	//���ѧ����Ϣ
	public static void add() {
//String name, int id, String sex, int age, String grade,
//		String address, String num, String emial)		
		//����ѧ����Ϣ
	       Scanner st= new	Scanner(System.in);
	       System.out.println("�����ѧ����Ϣ");
	       System.out.println("�����ѧ������");
	        String name= st.next();
	        System.out.println("�����ѧ������:"+ name);
	        System.out.println("�����ѧ��id");
		    int id=st.nextInt();
		    System.out.println("�����ѧ��id:"+id);
		    System.out.println("�����ѧ���Ա�");
		    char sex=st.next().charAt(0);
		    System.out.println("�����ѧ���Ա�:"+ sex);
		    System.out.println("�����ѧ������");
		   int age=st.nextInt();
		    System.out.println("�����ѧ������:"+ age);
		    System.out.println("�����ѧ���꼶");
		   String grade=st.next();
		    System.out.println("�����ѧ���꼶:"+ grade);
		    System.out.println("�����ѧ����ַ");
		    String address=st.next();
		    System.out.println("�����ѧ����ַ:"+ address);
		    System.out.println("�����ѧ����ϵ��ʽ");
		   String num=st.next();
		    System.out.println("�����ѧ����ϵ��ʽ:"+ num);
		    System.out.println("�����ѧ������");
		    String emial=st.next();
		    System.out.println("�����ѧ������:"+emial);
		    Student student1 = new	Student();
//		    Student student2=new Student("����",3,'��',100,"�м�","�����в�ƽ��","123456789122","zhangsan@qq.com");
		    student1.name=name;
		    student1.id=id;
		    student1.sex=sex;
		    student1.age=age;
		    student1.grade=grade;
		    student1.address=address;
		    student1.num=num;
		    student1.emial=emial;
//		    Student[] students= {student2};
//��������
			students=Arrays.copyOf(students,students.length+1 );
		    students[1]=student1;
		    if(students[1] == null) {
		    	System.out.println("���ʧ�ܣ����������");
		    }System.out.println("��ӳɹ�,��鿴ѧ����Ϣ");
		    
		    show();
		  }
	//�鿴ѧ����Ϣ
	public static void show() {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}System.out.println("����id�޸�ѧ������");
		update();
	}
	//����id�޸�ѧ����Ϣ
	public static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵĽ�ɫ��id:");
		int  id = scanner.nextInt();
		System.out.println("�������޸ĵ�����:");
		int age1 = scanner.nextInt();
		for(int i=0;i<students.length;i++) {
			if(students[0].id==id) {
				// ���޸Ĳ���
				students[0].age = age1;
				System.out.println("�޸ĳɹ�");
				System.out.println("�޸ĺ����Ϣ:"+students[i]);
			}
		}
		start();
	}
	//����id�鿴ѧ����Ϣ
	public static void showId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��id:");
		int  id = scanner.nextInt();
		for(int i=0;i<students.length;i++) {
			if(students[i].id==id) {
				System.out.println(students[i]);
			}
		}
		choice();
	}
	//ɾ��ѧ����Ϣ
	public static void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ҫɾ����ѧ���ر�:");
		String name= scan.next();
		for(int i=0;i<students.length;i++) {
			if(students[i].name.equals(name)) {
				students[i] = students[students.length-1];
				students = Arrays.copyOf(students, students.length-1);
			}
		}
		System.out.println("ɾ�������Ϣ:"+Arrays.toString(students));
	start();
	}
	//�˳�����
	public static void file() {
		System.exit(0);
	}
	
	}

