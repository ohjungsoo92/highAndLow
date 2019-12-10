package jungsoo_cardGame;

import java.util.Scanner;

public class highAndLow {	

	public static void main(String[] args) {
		while(true) {
		System.out.println("***************");
		System.out.println("* High  & Low *");
		System.out.println("***************");
		System.out.println("");
		int random = (int)(Math.random()*9)+1;
		System.out.println("  [問題表示]");
		System.out.println("*****    *****");
		System.out.println("*   *    * * *");
		System.out.println("* "+random+" *    * * *");
		System.out.println("*   *    * * *");
		System.out.println("*****    *****");
		Scanner sc = new Scanner(System.in);
		System.out.print(" High or Low ?(h/l) >");
		String input = sc.nextLine();	// inputはキーボードで入力された結果
		if(input.equals("h"))
		{System.out.println("->Highを選択しました。");}
		else {System.out.println("->Lowを選択しました。");}
		System.out.println("");
		System.out.println("  [結果表示]");
		System.out.println("*****    *****");
		System.out.println("*   *    *   *");
		int random2 = (int)(Math.random()*9)+1;		//　比較するために新しいrandom２を宣言
		System.out.println("* "+random+" *    * "+random2+" *");
		System.out.println("*   *    *   *");
		System.out.println("*****    *****");
		String result;
		if(random<random2) {result="h";}
		else if(random>random2) {result = "l";}
		else {result = "h";}
		if(input.equals(result)) {System.out.println("->You Win!");}
		else {System.out.println("->You Lose");
		break;}
		System.out.println("");
		System.out.println(" --ゲーム終了--");
		}

}
}
