import java.util.Arrays;

// Arrays	: 배열을 다루기 편리한 메서드 제공
//			: 배열이란 자료형의 종류가 아닌 자료형의 집합
//
// 1. 배열 출력	-	toSting()
//					deepToString()	/ 다차원 배열의 출력
//
// 2. 배열의 복사	-	copyOf()
//					copyOfRange()	/ 범위설정(from, to)
//
// 3. 배열채우기	-	fill())
//	 				setAll()
//
// 4. 배열의 정렬	-	sort()
//
// 5. 배열 검색	-	binarySearch()	/ sort()로 정렬 후 사용 해야 함.
//
// 6. 배열의 비교	-	equals()
//				-	deepEquals()	/  다차원 배열의 비교
//
// 7. 배열 변환	-	asList(Object...a)	/	배열을 List로 변환
//				-	주의할 점은 asList()가 반환한 List의 크기를 변경할 수 없다는 것이다. 
//					즉, 추가 또는 삭제가 불가능하다. 저장된 내용은 변경가능하다. 



public class Ch11_Arrays {

	public static void main(String[] args) {

		int[]	arr   =  {0,1,2,3,4};
		int[][] arr2D =  {{11,12,13}, {21,22,23}};

		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("arr2D="+Arrays.deepToString(arr2D));

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);          
		int[] arr4 = Arrays.copyOf(arr, 7);          
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);  
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);  

		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));

		int[] arr7 =  new int[5];
		Arrays.fill(arr7, 9); 									// arr=[9,9,9,9,9]
		System.out.println("arr7="+Arrays.toString(arr7));

		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);		// 람다식
		System.out.println("arr7="+Arrays.toString(arr7));

		
//	향상된 for문	: 위의 문장에서 타입은 배열 또는 컬렉션의 요소의 타입이어야 한다. 
//				  배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장된다. 
//				  그리고 반복문의 괄호{} 내에서는 이 변수를 사용해서 코드를 작성한다.
//				  그러나 향상된 for문은 일반적인 for문과 달리 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용 가능
//		
//	for( 타입변수명 : 배열또는컬렉션) { 
//	반복할문장
//	}
		
		// 향상된 for문
		for(int i : arr7) {										
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);			// char[] →  String : String(char[]) 생성자 사용
		}														// String → char[]	: tocharArray() 사용		

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(Arrays.equals(str2D, str2D2));     	// false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); 	// true

		char[] chArr = { 'A', 'D', 'C',  'B', 'E' };

		int idx = Arrays.binarySearch(chArr, 'B');
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		System.out.println("= After sorting =");
		Arrays.sort(chArr);
		System.out.println("chArr="+Arrays.toString(chArr));
		System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
		
		
	}

}
