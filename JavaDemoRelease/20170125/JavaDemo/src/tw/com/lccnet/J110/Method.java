package tw.com.lccnet.J110;

/**
 * 方法的宣告與多載
 * 
 *
 */
public class Method {

	/**
	 * 無傳入，無回傳
	 */
	public void method1(){
		
	}
	
	/**
	 * 無回傳，有傳入
	 * @param a 傳入值
	 */
	public void method2(int a){
		
	}
	
	/**
	 * 有回傳，無傳入
	 * @return Integer
	 */
	public int method3(){
		return 0;
	}
	
	/**
	 * 有傳入，有回傳
	 * @param a Integer
	 * @return Integer
	 */
	public int method4(int a){
		return a;
	}
	
	/**
	 * 可變參數
	 * @param a Integer[]
	 */
	public void method5(int... a){
		int t = 0;
		for(int i:a){
			t += i;
		}
		
		System.out.println(t);
	}
}
