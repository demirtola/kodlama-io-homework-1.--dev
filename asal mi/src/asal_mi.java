
public class asal_mi {

	public static void main(String[] args) {
		int sayi = 997;
		int bolen = 2;
		boolean asal_mi = true;

		while (sayi > bolen + 1) {
			if (sayi <= 1)
				break;
			if (sayi % bolen == 0) {
				asal_mi = false;
				break;
			} else
				bolen++;
		}
		if (asal_mi)
			System.out.println("sayi asaldir");
		else
			System.out.println("sayi asal degildir");
	}
}
