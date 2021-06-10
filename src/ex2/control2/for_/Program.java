package ex2.control2.for_;

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
		
		while(true){
			//============================성적 입력 부분=========================
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│             성적입력  　    　　　　│");
			System.out.println("└───────────────────────────────┘");
			
			do {
				System.out.print("국어1 : ");
				kor1 = scan.nextInt();
			
				if(kor1<0 || 100<kor1)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				
			}while(kor1<0 || 100<kor1);
			
			do {
				System.out.print("국어2 : ");
				kor2 = scan.nextInt();
				
				if(kor2<0 || 100<kor2)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				
			}while(kor2<0 || 100<kor2);
			
			do {
				System.out.print("국어3 : ");
				kor3 = scan.nextInt();
				
				if(kor3<0 || 100<kor3)
					System.out.println("성적범위(0~100)를 벗어났습니다.");
				
			}while(kor3<0 || 100<kor3);
			
			//============================성적출력부분=========================
			total = kor1+kor2+kor3;
			avg = total / 3.0f;
			
			System.out.printf("total is %d\n", total);
			System.out.printf("avg is %f\n", avg);
			
			System.out.println("┌───────────────────────────────┐");
			System.out.println("│             성적출력  　    　　　　│");
			System.out.println("└───────────────────────────────┘");
			
			for(int i=0; i<3; i++) {
				System.out.printf("\t국어%d : %3d\n", i+1, kor1);
			}
			System.out.printf("\t총점  : %3d\n", total);
			System.out.printf("\t평균  : %6.2f\n", avg);	
			System.out.println("─────────────────────────────────");
			
		}
	};

}

//		int i = 3;
//		for(int k = 1; k<10;k++)
//			System.out.println(i+"X"+k+"="+i*k);