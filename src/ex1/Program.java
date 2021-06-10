package ex1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		//============================성적 입력 부분=========================
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│             성적입력  　    　　　　│");
		System.out.println("└───────────────────────────────┘");
		System.out.print("국어1 : ");
		
		kor1 = scan.nextInt();
		
		int validate = 0<=kor1 && kor1<=100?1:0;
		System.out.println(validate);
//		System.out.println(0<=kor1 && kor1<=100?"유효합니다.":"잘못된값입니다.");
		
		System.out.print("국어2 : ");
		kor2 = scan.nextInt();
		
		System.out.print("국어3 : ");
		kor3 = scan.nextInt();
		
		//============================성적출력부분=========================
		total = kor1+kor2+kor3;
		avg = total / 3.0f;
		
		System.out.printf("total is %d\n", total);
		System.out.printf("avg is %f\n", avg);
		
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│             성적출력  　    　　　　│");
		System.out.println("└───────────────────────────────┘");
		
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점  : %3d\n", total);
		System.out.printf("\t평균  : %6.2f\n", avg);	
		
//		int i = 3;
//		for(int k = 1; k<10;k++)
//			System.out.println(i+"X"+k+"="+i*k);
		
	};

}
