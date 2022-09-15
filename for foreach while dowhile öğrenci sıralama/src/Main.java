
public class Main {

	public static void main(String[] args) {
		long[] ogrenciNumaralari = {200202001, 200202003, 200202006, 200202010, 200202015, 200202024};
		
		System.out.println("\n------------\nwhile ile yazdiriliyor:");
		int index = 0;
		while(index++ < ogrenciNumaralari.length) {
			System.out.println(ogrenciNumaralari[index]);
		}
		
		System.out.println("\n------------\ndo-while ile yazdiriliyor:");
		index = 0;
		do {
			System.out.println(ogrenciNumaralari[index]);
		}while(index++ < ogrenciNumaralari.length);
	}
}
