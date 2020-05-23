class Student{
	private String imie, nazwisko, grupa;
	private double[] oceny;
	//constructors
	protected Student(){
		double[] oceny = new double[10];
		imie = "Jan";
		nazwisko = "Paweł";
		grupa = "B";
	}
	protected Student(String imie, String nazwisko, String grupa, int rozmiar){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.grupa = grupa;
		double[] oceny = new double[rozmiar]; 
	}
	
	protected void test(){ System.out.println("Dzialam"); }
	
	public String toString(){ return getImie() + " " + getNazwisko() + " ";}
	
	//getter's for variables
	public String getImie() { return imie; }
	public String getNazwisko() { return nazwisko; }
	public String getGrupa() { return grupa; }
	public int getIloscOcen() { return oceny.length; }		
}
