package tw.com.lccnet.Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Ticket t1 = new Ticket();
		TickThread ticketThread = new TickThread(t1);
		TickThread ticketThread2 = new TickThread(t1);
		TickThread ticketThread3 = new TickThread(t1);
		TickThread ticketThread4 = new TickThread(t1);
		ticketThread.start();
		ticketThread2.start();
		ticketThread3.start();
		ticketThread4.start();
		
	}

}

class Ticket implements Runnable {
	private int _tick = 100;

	public void run(){
		
		while(true){
			if(_tick > 0){
				System.out.println(this._tick--);
			}
		}
	}
}
