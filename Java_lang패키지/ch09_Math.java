// Math : 수학관련 static메서드의 집합
// static double rint(double a) : 주어진 double값과 가장 가까운 정수값을 double형으로 반환
//								: 단, 두 정수의 정가운데 있는 값(1.5/2.5/3.5)은 짝수를 반환
//
// static long round(float / double a)	: 소수점 첫째자리에서 반올림한 정수값(long)을 반환한다. 
//										: 두 정수의 정가운데 있는 값은 항상 큰 정수를 반환
//
// 위 2가지를 비교해서 알아보기 


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