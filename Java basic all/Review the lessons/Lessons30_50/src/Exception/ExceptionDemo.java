package Exception;

public class ExceptionDemo {
	public static void main(String[] arqs) {
		System.out.println("First line");
		int a = 0;
		int b = 2;
		String [] name = {"Lork", "Leu"};
		try {
			double x = b/a;
			System.out.println(x);
		}catch (ArithmeticException e) {
			System.out.println("Error ArithmeticException !");
			System.out.println(e.getMessage());
			e.printStackTrace();
			//System.exit(0);
			//return;
		}finally {
			System.out.println(name[2]);
			System.out.println("Finally block");
		}
		System.out.println("Seond line");
	}
}
