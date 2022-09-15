
public class Main {

	public static void main(String[] args) {
		char filmKalitesi = 'A';
		switch (filmKalitesi) {
		case 'A':
			System.out.println("bu film kaliteli bir filmdir");
			break;
		case 'B':
			System.out.println("bu film ortalama kaliteli bir filmdir");
			break;
		case 'C':
			System.out.println("bu film ortalamadan kötü kalitede bir filmdir");
			break;
		case 'F':
			System.out.println("bu film rezil bir filmdir");
			break;
		}
	}
}
