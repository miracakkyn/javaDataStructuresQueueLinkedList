package bagliListeKuyruk;

public class BagliListeKuyruk {
	int size;
	int cnt;
	Eleman front;
	Eleman rear;
	public BagliListeKuyruk(int size) {
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
		
	}
	void enQueue(String isim, String soyisim, int telno, int dt) {
		if(isFull()) {
			System.out.println("Kuyruk Dolu , eleman ekleyecek yer yok");
		}else {
			Eleman eleman=new Eleman(isim,soyisim,telno,dt);
			if(isEmpty()) {
				front=eleman;
				rear=eleman;
				System.out.println(eleman.isim+" Kuyruğa eklendi");
			}else {
				rear.next=eleman;
				rear=rear.next;
				System.out.println(eleman.isim+" Kuyruğa eklendi");

			}
			cnt++;
		}
		
		
	}
	void deQueue() {
		if(isEmpty()) {
			System.out.println("Kuyruk boş silinecek eleman yok");
		}else {
			System.out.println(front.isim+" silindi");
			front=front.next;
			cnt--;
		}
	}
	void printKuyruk() {
		if(isEmpty()) {
			System.out.println("Kuyruk Boş Yazdırılacak Eleman Yok");
		}else {
			System.out.print("bas <- ");
			Eleman temp=front;
			while(temp!=null) {
				System.out.print(temp.isim+" "+temp.soyisim+" "+temp.dt+" "+temp.telno+" <- ");
				temp=temp.next;
			}
			System.out.println("son");
		}
	}
	boolean isFull() {
		return size==cnt;
	}
	boolean isEmpty() {
		return cnt==0;
		
	}
	void kuyrukBoyut() {
		System.out.println(cnt);
	}
	
	

}
