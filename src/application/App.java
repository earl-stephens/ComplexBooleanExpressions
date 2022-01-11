package application;

public class App {

	public static void main(String[] args) {
		boolean isRaining = false;
		boolean mightRain = false;
		boolean haveUmbrella = true;

		if(haveUmbrella && (isRaining || mightRain)) {
			System.out.println("Take umbrella!");
		} else {
			System.out.println("Don't take umbrella.");
		}
	}

}
