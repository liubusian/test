package tw.com.lccnet.J275.proxy;

public class ProxySubject implements Subject {

		private Subject proxy;
		
		public ProxySubject(Subject proxy) {
			this.proxy = proxy;
		}

		@Override
		public void operJect() {
			System.out.println("代理商品");
			proxy.operJect();
			
		}

		@Override
		public void operJect(String str) {
			proxy.operJect("特定商品:"+str);
			
		}
		
		
}
