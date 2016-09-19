package hw;
/*
 * Topic:  假設我們要用二進制來表示 n 種狀態，
 * 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw03_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please input a=");
		int a=scn.nextInt();
		System.out.println("Please input b=");
		int b=scn.nextInt();
		System.out.println("Please input c=");
		int c=scn.nextInt();
		System.out.println("Please input d=");
		int d=scn.nextInt();
		System.out.println("Please input e=");
		int e=scn.nextInt();
		System.out.println("Please input f=");
		int f=scn.nextInt();
		int g=(int)Math.min(a, b);
		 g=(int)Math.min(g, c);
		 g=(int)Math.min(g, d);
		 g=(int)Math.min(g, e);
		 g=(int)Math.min(g, f);
		System.out.println("The min="+g); 
	}

}
