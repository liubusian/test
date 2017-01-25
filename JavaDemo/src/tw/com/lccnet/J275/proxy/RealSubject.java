package tw.com.lccnet.J275.proxy;

public class RealSubject implements Subject{

	@Override
	public void operJect() {
		System.out.println("開始實作商品");
		System.out.println("結束實作商品");
		
	}

	@Override
	public void operJect(String str) {
		System.out.println("開始訂做商品...");
		System.out.println("訂做商品"+str);
		System.out.println("結束訂做商品...");
		
	}

	
}
