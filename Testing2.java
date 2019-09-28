package Project;

public class Testing2 {
	
	class Main{
		int i;
	}

		public static void main(String... args) {
		System.out.println("main with String...");
		
		Student s1 = new Student("aki", 1);
		Student s2 = new Student("cuni", 2);
		System.out.println(s1.getName() + ", " + s1.getId());
		s1 = s2;
		System.out.println(s1.getName() + ", " + s1.getId());
		
		Main m = null;
		System.out.println(m.i);
		}
		public static void main(String args) {
		System.out.println("main with String");
		}
		public static void main() {
		System.out.println("main without args");
		
		}
		
}
