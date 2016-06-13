package generic;

public class TestInner {

	private Integer a = 10;

	// Works in java 8
	void abc() {
		Integer b = 11;
		class InnerClass {
			void test() {
				System.out.println(a + " : " + b);
			}
		}

	}

	public static void main(String[] args) {
		TestInner test = new TestInner();
		test.abc();
		// test.new InnerClass().test();
	}

}
