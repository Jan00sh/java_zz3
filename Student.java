class Student{
	private String imie, nazwisko, grupa;
	private double[] oceny;
	//constructors
	public Student(){
		oceny = new double[10];
		imie = "Jan";
		nazwisko = "Pawel";
		grupa = "B";
	}
	public Student(String imie, String nazwisko, String grupa, int rozmiar){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.grupa = grupa;
		oceny = new double[rozmiar]; 
	}
	
	public String toString(){ return getImie() + " " + getNazwisko() + " " + getGrupa() + " " + sredniaOcen(); }
	
	public String getImie() { return imie; }
	public String getNazwisko() { return nazwisko; }
	public String getGrupa() { return grupa; }
	public int getIloscOcen() { return oceny.length; }
	public double getOcena(int index) { return oceny[index]; };
	public void setImie(String imie) { this.imie = imie; };
	public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; };
	public void setGrupa(String grupa) { this.grupa = grupa; };
	public void setOcena(int index, double ocena) { oceny[index] = ocena; };
	
	public int wpiszOcene(double ocena) {
		for(int i = 0; i < getIloscOcen(); i++) {
			if(getOcena(i) == 0) {
				setOcena(i, ocena);
				return i;
			}
		}
		return -1;
	}
	
	public double sredniaOcen() {
		int i = 0;
		double suma = 0;
		for(double ocena : oceny) {
			if(ocena == 0.0)
				break;
			suma += ocena;
			i++;
		}
		if(i == 0)
			return 0.0;
		return suma/i;
	}
	
	public boolean sesjaZaliczona() {
		for(double ocena : oceny) {
			if((ocena <= 2.0)&&(ocena != 0.0))
				return false;
		}
		return true;
	}
	
	public boolean stypendium() {
		if(sesjaZaliczona()&&(sredniaOcen()>4))
			return true;
		else return false;
	}
}
