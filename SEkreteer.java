package OOP_proje_kurs_admition;

import java.util.Random;

public class SEkreteer {
	Random  random = new Random(); // we USe for bill foer give us one nums
	private   String name;
	
	private int payment = 3000;
	private int billNo = random.nextInt(40000);
	
	public SEkreteer(String name1) {
		// TODO Auto-generated constructor stub
		this.name = name1;
	}
	public Random getRandom() {
		return random;
		
	}
	public void setRandom(Random random0) {
		this.random = random0;
		
		
	}
	public String getName() {
		return name;
		
	}
	public void setName(String ad) {
		this.name = ad;
	}
	
	public int getPayment() {
		return payment;
		
	}
	public void setPayment( int ucret) {
		this.payment = ucret;
	}
	
	public int getBillNo() {
		return billNo;
		
	}
	public void setBillNo( int fatura) {
		this.billNo = fatura;
	}
	public void bilgilendirme() {
		String mesaj = "Kurs kaydi islemi Sekreterlerimiz " + "tarafindan isleme linmistir \n"
				+ "Lutfen ilgili fatura numarasini muhbasebe birimine  iletiniz\n"
				+ "Fatura numariniz  " + billNo;
		System.out.print(mesaj);
	}
	
	

}
