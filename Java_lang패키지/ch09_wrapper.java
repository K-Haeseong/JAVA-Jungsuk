// wrapper 클래스 : 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스


public class ch09_wrapper {

	public static void main(String[] args) {
		
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i=i2 결과는? => " + (i==i2));
		System.out.println("i.equals(i2) 결과는? => " + (i.equals(i2)));
		System.out.println("i.coparetTo(i2) = " + i.compareTo(i2));
		// 2개를 비교 - 같으면 : 0 / (오른쪽 값이)작으면 : 양수 / 크면 : 음수
		System.out.println("i.toString() = " + i.toString());
		
		
		System.out.println("MAX_VALUE="+Integer.MAX_VALUE);	// 최대값
		System.out.println("MIN_VALUE="+Integer.MIN_VALUE);	// 최소값
		System.out.println("SIZE="+Integer.SIZE+"bits");	 
		System.out.println("BYTES="+Integer.BYTES+"bytes");	
		System.out.println("TYPE="+Integer.TYPE);
		
		
		
		
	}

}
