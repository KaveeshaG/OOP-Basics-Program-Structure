
public class Animal {

	int age;
	String gender;
	int height;
	
	public Animal(int age, String gender,int height) {
		this.age=age;
		this.gender=gender;
		this.height=height;
	}
	
	public void eat() {
		System.out.println("eating.....");
	}
	
	public void sleep() {
		System.out.println("sleepinging.....");
	}
}
