package Project;

public class Testing3 {
	
		static int a;
		
			static {
					a = 4;
					System.out.println("static blok");
					System.out.println("a = " + a);
				}
			
		Testing3() {
			System.out.println("konstruktor");
			a = 10;
			}
		
		public static void func() {
			a = a + 1;
			System.out.println("a = " + a);
			}
		
		public static void main(String[] args) {
			Testing3 obj = new Testing3();
			obj.func();
			}
		}

