class A5StudentVO//DTO  data transfer object ����� �� �ִ�. VO value of object ��� �Ѵ�.
{
	private String dept;
	private String stcode;
	private String name;
	private int age;
	//���Ͱ��� ������
	public A5StudentVO() 
	{
			
	}
	public A5StudentVO(String dept, String stcode, String name, int age) {
		
		this.dept = dept;
		this.stcode = stcode;
		this.name = name;
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getStcode() {
		return stcode;
	}
	public void setStcode(String stcode) {
		this.stcode = stcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return   dept +stcode + name + age ;
	}
	//BO business object
	//DO database object
	//Service
	
}