package id.d3ti.oop1.thread;

class Mainthread{
	public void jalan(String name){
		for(int i=0; i<5; i++){
			try{
				Thread.sleep(1000);
			}
			catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Thread: "+name+" posisi: "+i);
		}
	}
}
	class threadInterface extends Mainthread implements Runnable{
		String name;
		public threadInterface(String name){
			this.name=name;
		}
		public void run(){
			jalan(name);
		}

		public static void main(String args[]){
			Threadextends vespa = new Threadextends("vespa");
			Threadextends sepeda = new Threadextends("sepeda");
			vespa.start();
			sepeda.start();
		}
	}
