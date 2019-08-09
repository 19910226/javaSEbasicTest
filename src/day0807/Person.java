package day0807;
//定义属性：编号、名字、性别、年龄、婚否、身份证号、地址、电话、伴侣
//提供方法：
// 结婚（参数是另外一个人）
// 定义合理的结婚规则结婚结果
// 如果成功就合理更新双方的属性：婚否和伴侣
// 返回true，代表结婚成功；结婚失败就返回false
/**    
 * @author 鹏飞;
 * @since 2019.08.07
 * @version 1.0
 * 
 * 
 * */
public class Person {
	public Person(int pNo, String name, char sex, short age, boolean isMarry, String iDCard, String addRess,
			String telNo, String partnerName) {
		this.pNo = pNo;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.isMarry = isMarry;
		this.IDCard = iDCard;
		this.addRess = addRess;
		this.telNo = telNo;
		this.partnerName = partnerName;
	}

	// 编号
	int pNo;
	
	// 姓名
	String name;
	
	// 性别
	char sex;
	
	// 年龄
	short age;
	
	// 是否婚否
	boolean isMarry;
	
	
	// 身份证号
	String IDCard;
	
	// 地址
	String addRess;
	
	// 手机号
	String telNo;
	
	// 伴侣名
	String partnerName;
	public boolean marry(Person anotherPerson) {
		// 男须满 22周岁 女需要 20周岁
		// 都是未婚
		// 性别必须不同
		if(this.age >=(this.sex=='男'?22:20)&&anotherPerson.age >=(anotherPerson.sex=='女'?20:22)) {
			if(this.isMarry == false && anotherPerson.isMarry==false) {
				if(this.sex != anotherPerson.sex) {
				   	this.isMarry = true;
				   	anotherPerson.isMarry = true;
				   	this.partnerName = anotherPerson.name;
				   	anotherPerson.partnerName = this.name;
				   	return true;
				}
			}
		}
		return false;
	
    
}}
//(int pNo, String name, char sex, short age, boolean isMarry, String iDCard, String addRess,
//		String telNo, String partnerName) {
class Test1{
	public static void main(String[] args) {
	    Person p = new	Person(1,"张三",'男',(short)34,false,"1221324","天津","123213534",null);
	    Person p1 = new	Person(2,"李四",'男',(short)34,false,"1221324","天津","123213534",null);
	  boolean m= p.marry(p1);
	  System.out.println(m);
	}
}
