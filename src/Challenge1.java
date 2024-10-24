
public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Challenge1 c = new Challenge1();
		System.out.println(c.m(a));

	}
	
	@SuppressWarnings("finally")
	int m(int a) {
		try {
			return a++;
		}
		finally {
			return ++a;
		}
	}

}
