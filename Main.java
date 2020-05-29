class Main{
	public static void main(String[] args){
		Student jacek = new Student("Jacek", "Placek", "A", 15);
		Student zenon = new Student();

		System.out.println(jacek);
		System.out.println(zenon);
		for(int i = 3; i <= 18; i++) {
			System.out.println(jacek.wpiszOcene(i));
		}
		System.out.println(jacek.wpiszOcene(4));
		System.out.println("\n" + jacek.sredniaOcen());
		System.out.println("\n" + jacek.sesjaZaliczona());
		System.out.println("\n" + jacek.stypendium());
	}
}
