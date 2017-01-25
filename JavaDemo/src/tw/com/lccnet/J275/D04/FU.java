package tw.com.lccnet.J275.D04;

public abstract class FU {

	private String name;
	public int age;
	
	public FU() {
		// TODO Auto-generated constructor stub
	}
	
	public FU(String name) {
		this.name = name;
	}
	
	public FU(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public abstract void print();
	
	
}
