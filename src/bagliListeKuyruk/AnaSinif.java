package bagliListeKuyruk;

public class AnaSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagliListeKuyruk kuyruk1=new BagliListeKuyruk(5);
		kuyruk1.enQueue("dsadsa", "sdafsa", 2000, 1);
		kuyruk1.enQueue("dsadsa", "sdafsa", 2000, 2);
		kuyruk1.printKuyruk();
		kuyruk1.deQueue();
		kuyruk1.printKuyruk();	
		kuyruk1.kuyrukBoyut();

		
	}

}
