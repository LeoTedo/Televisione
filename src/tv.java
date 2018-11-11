import java.util.*;

public class tv {
	static telecomando t = new telecomando(0, 1, false, true);
	static Scanner sc = new Scanner(System.in);
	static canali c = new canali("Rai 1", "Rai 2", "Rai 3", "Rete 4", "Canale 5", "Italia 1", "La7", "Canale 8",
			"Canale 9", "Telelombardia");

	public static void main(String[] args) {

		int m;
		do {
			System.out.println("");
			System.out.println("1. Accendi TV");
			System.out.println("2. Aumenta volume");
			System.out.println("3. Abbassa volume");
			System.out.println("4. Sali di canale");
			System.out.println("5. Scendi di canale");
			System.out.println("6. Spegni TV");

			m = sc.nextInt();
			sc.nextLine();
			switch (m) {

			case 1:
				t.accendi(false);
				break;
			case 2:
				t.sali(0);
				break;
			case 3:
				t.scendi(0);
				break;
			case 4:
				t.salic(0);
				break;
			case 5:
				t.scendic(0);
				break;
			case 6:
				t.spegni(true);

			}
		} while (m <= 6);
	}

}
