
public class Main {

	public static void main(String[] args) {
		char[] kalinHarfler = { 'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u' };
		char[] inceHarfler = { 'E', 'e', 'İ', 'i', 'Ö', 'ö', 'Ü', 'ü' };
		char harf = 'e';

		int durum = 0;

		while (true) {
			for (char chr : kalinHarfler) {
				if (chr == harf) {
					durum = 1;
					break;
				}
			}
			for (char chr : inceHarfler) {
				if (chr == harf) {
					durum = 2;
					break;
				}
			}
			break;
		}
		
		if(durum == 0)	System.out.println("harf sesli harf değildir");
		else if(durum == 1)	System.out.println("kalın sesli harf");
		else if(durum == 2)	System.out.println("ince sesli harf");

	}

}
