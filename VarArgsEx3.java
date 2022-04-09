public class VarArgsEx3 {
    public static void main(String[] args) {
		show(6);
	}
	static void show(int...a) {
		System.out.println("int var-args");
	}
	static void show(int a) {
		System.out.println("int");
	}
	static void show(double a) {
		System.out.println("double");
	}
    
}
