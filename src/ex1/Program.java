package ex1;

public class Program {
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1+kor2+kor3;
		avg = total / 3.0f;
		//============================성적출력부분=========================
		
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│             성적출력  　    　　　　│");
		System.out.println("└───────────────────────────────┘");
		
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점 : %3d\n", total);
		System.out.printf("\t평균 : %3d\n", total/3);	
		
		int i = 3;
		for(int k = 1; k<10;k++)
			System.out.println(i+"X"+k+"="+i*k);
		
	};

}
