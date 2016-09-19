package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex02_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Please input k=");
		int k=scn.nextInt();
	    double p=k*0.45359;
		System.out.println("p="+p);
	}

}
