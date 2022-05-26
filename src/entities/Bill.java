package entities;

public class Bill {

	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}

	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}
	
	public double feeding() {
		return beer * 5 + barbecue * 7 + softDrink * 3;
	}
	
	public double cover() {
		if(feeding() > 30.00) {
			return 0.00;
		}
		else {
			return 4.00;
		}
	}
	
	public double ticket() {
		if(gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
}
