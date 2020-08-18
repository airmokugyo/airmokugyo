package variable;

public class Task3 {

	public static void main(String[] args) {
		
		int intNum = 219;
		double doubleNum = 364.2;
		long longNum = 123456L;
		
		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);
		
		long longNum2 = intNum;
		float floatNum = (float)doubleNum;
		doubleNum = longNum;
		
		System.out.println("変換後");
		System.out.println(longNum2);
		System.out.println(floatNum);
		System.out.println(doubleNum);
	}

}
