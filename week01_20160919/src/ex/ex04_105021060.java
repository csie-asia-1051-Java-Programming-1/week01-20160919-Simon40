package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex04_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("Please input a=");
        int a=scn.nextInt();        
        int b=(int)Math.sqrt(a);
        System.out.println("b="+b);
	}

}
