package Project;

public class Testing {
	
	Testing() {
		super();
		//this();
		System.out.println("Test class object is created");
		}
	
	public static void main(String[] args) {
		String niz[] = { "Java", "JDK", "JRE" };
		String string = "Java";
		System.out.println(niz[0].hashCode());
		System.out.println(string.hashCode());
		System.out.println(niz[0] == string);
		System.out.println(niz[0].equals(string));
		
		char chars[] = { 'a', 'b', 'c' };
		String str = new String(chars);
		System.out.println(str);
		
		int y = 0;
		for (int i = 0; i < 8; ++i) {
		y += i;
		//y == i;
		}
		System.out.println(y);
		Testing t = new Testing();
		
		Integer broj = 2;
		broj = 8;
		System.out.println(broj);
	}
}