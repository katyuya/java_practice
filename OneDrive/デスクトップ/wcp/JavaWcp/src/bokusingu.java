
public class bokusingu {
	public static void main(String[] args) {
		Integer integer1 = 5; //オートボクシング
		System.out.println(integer1);
		Integer integer2 = Integer.valueOf(5); //明示的なボクシング
		System.out.println(integer2);
		int int1 = integer1; //アンボクシング
		System.out.println(int1);
		int int2 = integer2.intValue(); //明示的なアンボクシング
		System.out.println(int2);
	}
}
