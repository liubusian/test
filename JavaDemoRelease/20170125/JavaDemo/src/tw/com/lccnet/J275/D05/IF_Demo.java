package tw.com.lccnet.J275.D05;

interface IF_Demo {

	public void method1();
}

interface IF_Demo2{
	
	public void method2();
}

interface IF_Demo3 extends IF_Demo, IF_Demo2{
	
	public void method3();
}

abstract class AB_Demo{
	
	public abstract void method();
}

/**
 * 1. class extends class 是單繼承
 * 2. class extends abstract class 是單繼承
 * 3. class implements interface 是多繼承
 * 4. interface extends interface 是多繼承
 * @author LCC
 *
 */
class Demo extends AB_Demo implements IF_Demo3{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}