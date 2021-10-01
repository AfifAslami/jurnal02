public class UnaryOperator{

	public static void main(String[] args){
		int a = 1;
		int b = 1;
		boolean bol_1 = true;
		System.out.println("Nilai a sebelum ++a: " + a);
		System.out.println("Nilai a saat ++a: " + ++a);
		System.out.println("Nilai a setelah ++a: " + a);
		
		System.out.println("Nilai b sebelum b++: " + b);
		System.out.println("Nilai b saat b++: " + b++);
		System.out.println("Nilai b setelah b++: " + b);
		
		System.out.println("Negasi nilai b: " + -b);
		System.out.println("Nilai awal bol_1: " + bol_1);
		System.out.println("Negasi nilai bol_1: " + !bol_1);
	}
}
