package Interview;

public class PyramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*	*	*	*	*	
//		*	*	*	*	
//		*	*	*	
//		*	*	
//		*	
//		for (int i = 0; i < 5; i++) {
//			for (int j = i; j < 5; j++) {
//				System.out.print("*");
//				System.out.print("\t");
//			}
//			System.out.println();
//		}
		
//		*	
//		*	*	
//		*	*	*	
//		*	*	*	*	
//		*	*	*	*	*
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
