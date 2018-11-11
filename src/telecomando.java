
public class telecomando {
	public static int volume = 0;
	public static int canale = 0;
	public static boolean onof = false;
	static canali c = new canali("Rai 1", "Rai 2", "Rai 3", "Rete 4", "Canale 5", "Italia 1", "La7", "Canale 8",
			"Canale 9", "Telelombardia");

	public telecomando(int volume, int canale, boolean on, boolean off) {
		this.volume = volume;
		this.canale = canale;
		this.onof = onof;
	}

	public void accendi(boolean on) {

		onof = true;
		System.out.println("TV accesa");

	}

	public void spegni(boolean off) {
		onof = false;
		System.out.println("TV spenta");
	}

	public void sali(int volume) {
		if (volume > 100) {
			System.out.println("Volume massimo a 100, occhio alle orecchie");
		} else {
			volume = volume + 1;
			System.out.println("Volume a: " + getVolume());
		}
	}

	public void scendi(int volume) {
		if (volume < 0) {
			System.out.println("Volume a 0");
		} else {
			volume = volume - 1;
			System.out.println("Volume a: " + getVolume());
		}
	}

	public void scendic(int canale) {
		if (canale <= 0) {
			System.out.println("Segnale assente");
		} else {
			canale--;
			System.out.println("Stai guardando: " + c.canali[canale]);
		}
	}

	public void salic(int canale) {
		if (canale > 10) {
			System.out.println("Segnale assente");
		} else {
			canale++;
			System.out.println("Stai guardando: " + c.canali[canale]);
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanale() {
		return canale;
	}

	public void setCanale(int canale) {
		this.canale = canale;
	}

	public boolean isOnof() {
		return onof;
	}

	public void setOnof(boolean onof) {
		this.onof = onof;
	}
}
