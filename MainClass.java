package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		
		GetterSetter yeni_ornek = new GetterSetter();
		
		
		yeni_ornek.isim = "Duygu";
		yeni_ornek.soyisim = "Eylül";
		yeni_ornek.yas = 22;
		yeni_ornek.yasadigi_yer = "İstanbul";
		
		
		System.out.println("İsim: " + yeni_ornek.getİsim());
		System.out.println("Soyisim: " + yeni_ornek.getSoyisim());
		System.out.println("Yaş: " + yeni_ornek.getYas());
		System.out.println("Yaşadığı Yer: " + yeni_ornek.getYasadigi_yer());
		

	}

}
