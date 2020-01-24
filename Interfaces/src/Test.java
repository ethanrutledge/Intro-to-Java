
public class Test {

	public static void main(String[] args) {
		Convert myConvert = new Convert();
		
		System.out.println(myConvert.toPounds(10));
		System.out.println(myConvert.toFahrenheit(20));
		System.out.println(myConvert.toASCII('A'));
		System.out.println(myConvert.webify("google"));
		System.out.println(myConvert.isEven(3));
		
	}
}
