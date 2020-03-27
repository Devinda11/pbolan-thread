package id.d3ti.oop1.thread;

public class Threadextends extends Thread{
	public Threadextends(String name){
		super(name);
	}

	public void run(){
		for(int i=0; i<5; i++){
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Thread: "+getName()+" posisi: "+i);
		}
	}

	public static void main(String args[]){
		Threadextends vespa = new Threadextends("vespa");
		Threadextends sepeda = new Threadextends("sepeda");
		vespa.start();
		sepeda.start();
	}
}