package stringler;

public class Main {

	public static void main(String[] args) {
		
		String[] kullanicilar = {
				"user:mete",
				"user:etem",
				"user:dede",
				"user:pepe",
				"user:nane"
		};
		
		System.out.println("kullanici isimleri:");
		
		for(String user : kullanicilar) {
			char[] isim = new char[4];
			user.getChars(5, 9, isim, 0);
			System.out.println(isim);
		}
	}
}
