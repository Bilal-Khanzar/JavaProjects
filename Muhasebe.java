package OOP_proje_kurs_admition;

import java.util.Scanner;

public class Muhasebe {
    private String ad;
    
    public Muhasebe(String name) {
		// TODO Auto-generated constructor stub
    	this.ad = name;
	}
    public String getAd() {
    	return ad;
    }
    public void setAd(String name) {
    	this.ad = name;
    }
    
    public void degerlendirme(SEkreteer s ) throws InterruptedException {//Bu işlem inheritance (miras) değil, sadece 
    	//bir nesne kompozisyonu (composition)
    	while(true) {
    		Scanner scanner = new Scanner(System.in);
    		int fatura_numarasi ;
    		
    		String mesaj = "merhaba ben bu kursu muhasebesinden sorumluyum \n"
    				+ "lutfen kayit islemlri tamamlamak icin fatura numarasini  giriniz ";
    		
    		System.out.println(mesaj);
    		fatura_numarasi = scanner.nextInt();
    		if(fatura_numarasi == s.getBillNo()) {
    			System.out.println("Fatura numarasini kontrol ediliyor ...");
    			
    			Thread.sleep(2000);
    			
    			String answer = "kurs muhasebe biriminden sorumlu olan " + ad + "tarafindan fatura numarasini "
    					+ "kontrol edildi ve dogru oldugunu ogrenildi\n"
    					+ "kursumuza hosgeldin ";
    			
        		System.out.println(answer);
        		return;
    		}
    		else {
				System.out.println("");
				System.out.println("Fatura numarasi kontrol diliyor ");
				Thread.sleep(3000);
				String yanitString = " kursumuzun muhasebe birimin sorumlusu tarafdindan kontrol edildi "+ ad+ " tarafindan fatura numarisi "
						+ "kontrol edildi ve yanlis oldugfunu ogrenildi \n"
						+ "lutfen fatura numrasini tekrar giriniz ";
				System.out.println(yanitString);
			}
    		
 }
    }
}
