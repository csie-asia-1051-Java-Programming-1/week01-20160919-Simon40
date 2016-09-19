package hw;
/*
 * Topic:  假設我們要用二進制來表示 n 種狀態，
 * 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw04_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("a=");
		int a=scn.nextInt();
		System.out.println("b=");
		int b=scn.nextInt();
		double c=(double)Math.pow(a,1f/b);
		System.out.println("c="+c);
	}

}
