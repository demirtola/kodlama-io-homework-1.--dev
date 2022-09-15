
public class Main {

	public static void main(String[] args) {
		long[] ogrenciNumaralari = { 200202001, 200202003, 200202006, 200202010, 200202015, 200202024 };

		System.out.println("------------\nwhile ile yazdiriliyor:");
		int index = 0;
		while (index < ogrenciNumaralari.length) {
			System.out.println(ogrenciNumaralari[index]);
			index++;
		}

		System.out.println("------------\ndo-while ile yazdiriliyor:");
		index = 0;
		do {
			System.out.println(ogrenciNumaralari[index]);
			index++;
		} while (index < ogrenciNumaralari.length);

		System.out.println("------------\nfor ile yazdiriliyor:");
		for (index = 0; index < ogrenciNumaralari.length; index++) {
			System.out.println(ogrenciNumaralari[index]);
		}

		System.out.println("------------\nforeach ile yazdiriliyor:");
		for (long numara : ogrenciNumaralari) {
			System.out.println(numara);
		}
	}
}
