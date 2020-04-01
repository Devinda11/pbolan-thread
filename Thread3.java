package id.d3ti.oop1.thread;

public class Thread3 extends Thread{
	public Thread3(String nama) {
		super (nama);
	}
	
	public static synchronized void tampil(String nama) {
		for(int j=0;j<4;j++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread " + nama + " posisi " +j);
			}
		}
	
	public void run() {
		tampil(getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread3 l1=new Thread3("l1");
		Thread3 l3=new Thread3("l3");
		l1.setPriority(MAX_PRIORITY);
		l1.start();
		l3.start();
		Extend l2= new Extend("l2");
		Extend l4=new Extend("l4");
		l2.start();
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			//TODO Auto-generate catch block
			e.printStackTrace();
		}
		l4.start();
	}
	}