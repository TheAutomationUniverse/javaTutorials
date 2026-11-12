package p005_Abstraction;

// Child Interface 'Interface1' extending Parent Interface 'Interface2'
public interface Interface1 extends Interface {

//	abstract method
	void abstractMethod1();

//	non abstract default method
	default void test() {
		System.out.println("Interface1 - Default Method");
	}
}
