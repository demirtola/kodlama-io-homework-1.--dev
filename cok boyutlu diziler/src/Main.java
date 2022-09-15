
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String[][] kullanici;
		kullanici = new String[5][2];

		kullanici[0][0] = "mete";
		kullanici[1][0] = "etem";
		kullanici[2][0] = "metin";
		kullanici[3][0] = "muzaffer";
		kullanici[4][0] = "mukaddes";

		kullanici[0][1] = "demirtola";
		kullanici[1][1] = "testtola";
		kullanici[2][1] = "belgesi";
		kullanici[3][1] = "pembe";
		kullanici[4][1] = "çilek";

		System.out.println("isim  soyisim");

		for (int i = 0; i < 5; i++) {
			System.out.print(kullanici[i][0]);
			System.out.print("  ");
			System.out.println(kullanici[i][1]);
		}
	}
}
