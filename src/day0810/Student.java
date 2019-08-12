package day0810;

public class Student {
	String name;
	int id;
	char sex;
	int age;
	String grade;
	String address;
	String num;
	String emial;
	public Student() {}
	public Student(String name, int id, char sex, int age, String grade, String address, String num, String emial) {
		super();
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
