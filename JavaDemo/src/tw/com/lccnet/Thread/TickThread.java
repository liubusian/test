package tw.com.lccnet.Thread;

public class TickThread extends Thread{

	private Ticket t = null;
	
	public TickThread(Ticket t){
		this.t = t;		
	}
	
	public void run(){
		t.run();
	}
}
