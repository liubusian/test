package test.J275.D09;

import org.junit.Test;

import test.J275.D09.Inner.InnerClass;
import tw.com.lccnet.J275.J09.Employee;
import tw.com.lccnet.J275.J09.Manager;

public class TestDemo {

	@Test
	public void showMethodTest(){
		
		Employee ee = new Manager();
		
		ee.show();
		
		ee.getShow();
		
		Manager m = (Manager)ee;
		
		m.ChildShow();
			
	}
	
	public void innerTest(){
		
		InnerClass i = new InnerClass();
		
		InnerClass
	}
}
