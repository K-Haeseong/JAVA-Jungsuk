// Math : 수학관련 static메서드의 집합


public class ch09_Math {

	public static void main(String[] args) {
		
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		
		
		for(double d=1.5; d <=10.5; d++ ) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
			
			if(d%2==0.5) {			
			System.out.printf("double : %4.1f, round : %4.1f, rint(버림)\t: %4.1f\n", d, d1, d2);
			} else {
			System.out.printf("double : %4.1f, round : %4.1f, rint(올림)\t: %4.1f\n", d, d1, d2);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		System.out.printf("double : %4.1f, round : %4.1f, rint\t: %4.1f\n", sum, sum1, sum2);		
		
	}
}