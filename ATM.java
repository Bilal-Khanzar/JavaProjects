package atm_programi_proje_oop;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		SinifAtm bankAtm = new SinifAtm("bilal Khanzar ");
		bankAtm.YatirPara(4552);
		bankAtm.cikart(250);
		
		bankAtm.cikart(5000);
		bankAtm.cikart(300);
		bankAtm.YatirPara(600);
		bankAtm.cikart(500);
		bankAtm.cikart(300);
		
		System.out.println(bankAtm.cikis());

	}

}
