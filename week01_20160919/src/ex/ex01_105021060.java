package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021060 陳俊仁
 */
import java.util.*;
public class ex01_105021060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        System.out.println("F=");
        int F=scn.nextInt();
        int C=(F-32)*5/9;
        System.out.println("C="+C);
	}

}
