
public class Main {

	public static void main(String[] args) {
		double eski_fiyat = 130;
		double yeni_fiyat = 110;
		
		if(yeni_fiyat > eski_fiyat) {
			System.out.print("Ürün zamlandı. zam oranı = %");
			System.out.println(((yeni_fiyat / eski_fiyat) * 100)-100);
		} else if(yeni_fiyat == eski_fiyat) {
			System.out.println("ürünün fiyatı ayni");
		}
		else {
			System.out.print("Ürüne indirim gelmiş. indirim oranı = %");
			System.out.println(100-((yeni_fiyat / eski_fiyat) * 100));
		}
	}

}
