public class array01 {
	public static void main(String[] args) {
		int[] array1 = new int[3]; //配列の宣言と生成
		array1[0] = 60;//インデックス番号を「0」を指定して1番目の要素にデータを代入
		array1[2] = 20;//2番目の要素より先に3番目の要素にデータを代入
		array1[1] = 20;
		int int2 = array1[2];
		System.out.println(int2);
		int array2[] = null;
		System.out.println(array2);
	}
}
