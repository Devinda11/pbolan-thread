package id.d3ti.oop1.thread;

public class MethodThread{
	public static void main(String args[]){
	//set priority
	Thread vespa = new Thread(new threadInterface("vespa"));
	Thread sepeda = new Thread(new threadInterface("sepeda"));
	vespa.setPriority(1);
	sepeda.setPriority(10);
	vespa.start();
	sepeda.start();

	//isAlive
	Thread mobil = new Thread(new threadInterface("mobil"));
	Thread bajai = new Thread(new threadInterface("bajai"));

	mobil.start();
	bajai.start();

	try{
		Thread.sleep(7000);
	}
	catch (InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("Setelah 7 menit mobil: "+mobil.isAlive()); //false berarti thread sudah mati

	//penggunaan join untuk memprioritaskan object join selama permilisecon
	Thread bus = new Thread(new threadInterface("bus"));
	Thread truck = new Thread(new threadInterface("truck"));
	bus.start();
	try{
		bus.join(3000);
	}
	catch (InterruptedException e){
		e.printStackTrace();
	}
	truck.start();
	}
}