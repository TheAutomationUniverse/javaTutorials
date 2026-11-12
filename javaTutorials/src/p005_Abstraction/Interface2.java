package p005_Abstraction;

public interface Interface2 {
//	abstract method
	void abstractMethod2();

//	non abstract default method
	default void test() {
		System.out.println("Interface2 - Default Method");
	}
}
