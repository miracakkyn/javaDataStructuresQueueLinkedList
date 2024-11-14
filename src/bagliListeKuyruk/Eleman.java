package bagliListeKuyruk;

public class Eleman {
	String isim;
	String soyisim;
	int telno;
	int dt;
	Eleman next;

	Eleman(String isim, String soyisim, int telno, int dt) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.telno = telno;
		this.dt = dt;
		next = null;
	}
}
