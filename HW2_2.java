import java.util.Scanner;
import java.util.Random;

public class HW2_2{
	public static void main (String args []) {
		Random rand = new Random ();
		int ans=rand.nextInt(100);
		int max=100;
		int min=1;
		int guess=0;
		Scanner scn= new Scanner (System.in);
		System.out.println("請輸入一個數字0~100:");
		while(true) {
			guess=scn.nextInt();
			int validate_num=ans-guess;
			if(validate_num>guess) {
				min=guess;
				System.out.println("輸入"+min+"~"+max);
			}else if(validate_num<guess){
				max=guess;
				System.out.println("輸入"+min+"~"+max);
			}else {
				System.out.println("你猜對答案了");
				break;
			}
		}
	}
}