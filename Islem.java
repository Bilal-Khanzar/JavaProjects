package OOP_proje_kurs_admition;

import java.util.Scanner;

public class Islem {
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		SEkreteer sek= new SEkreteer("Bilal");
		Scanner scanner = new Scanner(System.in);
		
		
		String giris="Kurs kayıt birimine hoş geldiniz\n"
		        + "Ben bu kurstta sekreter biriminden sorumlu "+sek.getName()+"\n"
		        + "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
		        + "Java,Kotlin ve Scala olmak üzere üç tür kursumuz bulunmaktadır\n"
		        + "Kurs ücretleri sabit olup 3.000 TL'dir\n"
		        + "Kursumuza kabul edilmeniz için ücreti peşin ödemeniz gerekmektedir";
		            System.out.println("////////////////////");
		            System.out.println(giris);
		                  System.out.println("////////////////////");
		            System.out.print("Lütfen kaydolmak istediğiniz kurs adını giriniz:");
		      
		            String kurs_adi=scanner.nextLine();
		            System.out.print("Lütfen kursa kaydolmak için muhasebeye yatıracağınız parayı giriniz:");
		            int yatirilacak_ucret=scanner.nextInt();
		                if(yatirilacak_ucret==sek.getPayment()){
		                    System.out.println("");
		                    sek.bilgilendirme();
		            Muhasebe m=new Muhasebe("Mehmet");
		                m.degerlendirme(sek);
		                
		                }
		                else {
		                    System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
		                    return;
		                }

	}

}




























/* if i did not use private we then we do not use the get or set only sek.name for example 
 * SEkreteer sek = new SEkreteer("Bilal");

String giris = "Kurs kayıt birimine hoş geldiniz\n"
        + "Ben bu kurstta sekreter biriminden sorumlu " + sek.name + "\n"
        + "Genel olarak kurs hakkında bilgi vermek gerekirse\n"
        + "Java, Kotlin ve Scala olmak üzere üç tür kursumuz bulunmaktadır\n"
        + "Kurs ücretleri sabit olup 3.000 TL'dir\n"
        + "Kursumuza kabul edilmeniz için ücreti peşin ödemeniz gerekmektedir";

System.out.println(giris);

System.out.print("Lütfen kursa kaydolmak için muhasebeye yatıracağınız parayı giriniz: ");
int yatirilacak_ucret = scanner.nextInt();

if (yatirilacak_ucret == sek.payment) { // doğrudan erişim
    System.out.println("Ücret doğru. Kayıt işlemi devam ediyor...");
    sek.bilgilendirme();
    Muhasebe m = new Muhasebe("Mehmet");
    m.degerlendirme(sek);
} else {
    System.out.println("Ücretin tamamını ödemediğiniz için başvurunuz reddedildi.");
    return;
}

 */

















