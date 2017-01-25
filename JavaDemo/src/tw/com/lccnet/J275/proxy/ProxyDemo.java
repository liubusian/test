package tw.com.lccnet.J275.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		
		RealSubject rs = new RealSubject();
		
		customer(new ProxySubject(rs));
	}
	
	public static void customer(Subject subject){
		subject.operJect();
		subject.operJect("ooo");
	}
}
