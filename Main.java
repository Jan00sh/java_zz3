class Main{
	public static void main(String[] args){
		Student jacek = new Student("Jacek", "Placek", "A", 15);
		Student zenon = new Student();

		System.out.println(jacek);
		System.out.println(zenon);
		jacek.test();
	}
}
