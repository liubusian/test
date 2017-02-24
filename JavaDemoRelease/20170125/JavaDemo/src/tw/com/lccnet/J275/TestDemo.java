package tw.com.lccnet.J275;

import org.junit.Test;

public class TestDemo {

	@Test
	public void show(){
		
		Person p1 = Person.GetInstance();
		
		Person p2 = Person.GetInstance();
		
		Person p3 = Person.GetInstance();
		//tt(new Person("aa",11,"tw"));
	}
	
	public void tt(Person p){
		
		System.out.println(p.toString());
		
		p.print();
	}
}
