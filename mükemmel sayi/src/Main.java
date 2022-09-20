
public class Main {

	public static void main(String[] args) {

		int sayi;
		int max = 1000;
		int toplam = 0;

		System.out.println(max + "sayisina kadar olan mükemmel sayilar:");
		for (sayi = 2; sayi < max; sayi++) {
			toplam = 0;
			for (int bolen = 1; bolen < sayi; bolen++) {
				if (sayi % bolen == 0) {
					toplam += bolen;
				}
				if (toplam == sayi) {
					System.out.println(sayi);
					break;
				}
			}
		}
	}
}
