package hspMak;

import java.util.Scanner;

public class HspMak {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Birinci sayiyi giriniz: ");
		double sayi1 = scanner.nextDouble();
		
		System.out.print("Ikinci sayiyi giriniz: ");
		double sayi2 = scanner.nextDouble();
		
		System.out.println("Yapmak istediginiz islemi secin: ");
		System.out.println("1. Toplama");
		System.out.println("2. Cikarma");
		System.out.println("3. Carpma");
		System.out.println("4. Bolme");
		
		int secim = scanner.nextInt();
		
		double sonuc;
		switch (secim) {
		case 1 : 
			
			sonuc = sayi1 = sayi2;
			System.out.println("Islemin sonucu: " +sonuc);
			break;
			
		case 2 :
			
			sonuc = sayi1 - sayi1;
			System.out.println("Islemin sonucu: "+ sonuc);
			break;
			
		case 3 :
			
			sonuc = sayi1 * sayi2;
			System.out.println("Islemin sonucu: " + sonuc);
			break;
			
		case 4:
			
			if ( sayi2 != 0) {
				sonuc = sayi1 / sayi2;
				System.out.println("Islemin sonucu: " + sonuc);
			} else {
				System.out.println("Bir sayi 0'a bolunemez");
			}
			break;
			
			default:
				System.out.println("Gecersiz islem secimi");
			
			
		
		}
		scanner.close ();
		
		
		
		

	}

}
