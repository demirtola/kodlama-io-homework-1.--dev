package diziler;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] sayilar;
		sayilar = new int[10];

		for (int i = 0; i < 10; i++) {
			sayilar[i] = rand.nextInt(0, 10000);
		}
		for (int i : sayilar) {
			System.out.print(i);
			System.out.print(" ");
		}

		int temp = 0;
		boolean islem = false;

		while (true) {
			for (int i = 0; i < sayilar.length - 1; i++) {
				if (sayilar[i] > sayilar[i + 1]) {
					islem = true;
					temp = sayilar[i];
					sayilar[i] = sayilar[i + 1];
					sayilar[i + 1] = temp;
				}
			}
			if  (islem == false) break;
			else islem = false;
		}
		System.out.print("\n");
		for (int i : sayilar) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
