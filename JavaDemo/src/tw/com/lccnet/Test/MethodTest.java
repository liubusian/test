package tw.com.lccnet.Test;

import java.text.DecimalFormat;

import org.junit.Test;

import tw.com.lccnet.J110.Method;

public class MethodTest {
	
	@Test
	public void method5_Test(){
		Method mt = new Method();
		
		mt.method5(1,2,4,1,53,15,236,2,62,46,24,6,2456,2,46,3);
	}
	
	public double GetA(int a){
		
		return a * 0.2;
	}
	
	@Test
	public void Calculate(){
		System.out.println(GetA(50000));
		System.out.println(50000 + 2000 - (1000 + GetA(50000)));
	}
	
	public double GetOne(){
		return 3600.0;
	}
	
	public double GetTwo(){
		
		return GetOne() + GetOne() * 0.5; 
	}
	
	public double GetTree(){
		int a = 3600;
		
		return 0.8 * ( (a + 3600*0.5) + 3600 );
	}
	
	public double Count(int n){
		int p = 3600;
		
		double total = 0;
		
		
		
		for(int i = 0; i < n; i++){
			
			if(n == 1){
				total += p;
			}else{
				total += p*0.5;
			}
		}
		
		return (n >= 3)? total * 0.8 : total;
	}
	
	// 3600
	// 第二件 0.5
	// 第三件 全0.8
	@Test
	public void X(){
		
		System.out.println(GetOne());
		System.out.println(GetTwo());
		System.out.println(GetTree());
		
	}
}
