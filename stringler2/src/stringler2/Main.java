package stringler2;

public class Main {

	public static void main(String[] args) {
		
		String[] kullanicilar = {
				"admin:metehan-demirtola",
				"Main User:etem-demir",
				"guest:dede-dedeoğlu",
				"user2:ahmet-özbek",
				"user3:nane-limon"
		};
		
		System.out.println("kullanici isimleri ve soy isimleri:");
		
		for(String user : kullanicilar) {
			int index = user.indexOf(":");
			System.out.println(user.substring(index+1).replace("-", " "));           
		}
	}
}
