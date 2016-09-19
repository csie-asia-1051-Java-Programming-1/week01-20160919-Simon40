package hw;
/*
 * Topic:  假設我們要用二進制來表示 n 種狀態，
 * 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class hw02_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		System.out.println("Please input n=");
		int n=scn.nextInt();
        int v1=rnd.nextInt(n)+1;
        int v2=rnd.nextInt(n)+1;
        int v3=rnd.nextInt(n)+1;
        int v4=rnd.nextInt(n)+1;
        int v5=rnd.nextInt(n)+1;
        int v6=rnd.nextInt(n)+1;
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);
        System.out.println("v3="+v3);
        System.out.println("v4="+v4);
        System.out.println("v5="+v5);
        System.out.println("v6="+v6);
	}

}
