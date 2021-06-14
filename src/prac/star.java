package prac;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int line=1; line<5; line++) {
//			for(int star=0; star<line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5; i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int i,j,k;
		for(i=1; i<=5; i++) {
			for(k=5; k>=i; k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
