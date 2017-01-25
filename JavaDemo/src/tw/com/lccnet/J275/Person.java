package tw.com.lccnet.J275;

public class Person {

	public String name;
	public int age;
	public String address;
	
	private Person(){
		
	}
	
	public static Person GetInstance(){
		return new Person();
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public void print(){
		System.out.println(this.toString());
	}
	
	
}
