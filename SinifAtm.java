package atm_programi_proje_oop;



public class SinifAtm {
	public static double paraniz = 1000;
	public String name;
	
	public SinifAtm(String ad ) {
		// Constractor denir buna 
		this.name = ad;
		//SinifAtm.paraniz = para;
	}
	public void YatirPara(int para_yatir) {
		SinifAtm.paraniz += para_yatir;
		System.out.println("paraniz yatirildi  bakiyeniz " + SinifAtm.paraniz);
		
	}
	public void cikart(int cikart) {
	    if (SinifAtm.paraniz <= 0) {
	        System.out.println("Paranız yok.");
	    } 
	    else if (SinifAtm.paraniz < 25) {
	        System.out.println("Bakiyeniz 25 TL'den az olduğu için para çekemezsiniz.");
	    } 
	    else if (cikart <= SinifAtm.paraniz) {
	        SinifAtm.paraniz = SinifAtm.paraniz - cikart;
	        System.out.println("Paranızı çekebilirsiniz. Kalan bakiyeniz: " + SinifAtm.paraniz + " TL");
	    } 
	    else {
	        System.out.println("Bakiyeniz yetersiz.");
	    }
	}

	public static String cikis() {
		return "cikis yapildi";
		
	}
	

}
