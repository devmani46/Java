
public class account {
	String name;
	int age;
	public static void main(String[] args) {
		account a1 = new account();
		a1.setName("dev");
		a1.setAge(18);
		
		System.out.println(a1.getName());
		System.out.println(a1.getAge());
		a1.printDetails();

	}
	
	//setter
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	public void printDetails() {
		System.out.println(name + "," + age);
		
	}
	
	
}
