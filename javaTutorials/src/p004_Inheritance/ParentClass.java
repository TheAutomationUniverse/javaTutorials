package p004_Inheritance;

public class ParentClass {
	public String parentName = "David";
	protected int parentAge = 44;
	char parentGender = 'M';
	private float parentHeight = 6.2F;
	final double parentSalary = 120.75;
	static boolean parentHaveKids = false;
	String hobby = "Football";

	public ParentClass() {
		System.out.println("Parent: Public Constructor");
	}

	protected ParentClass(int age) {
		System.out.println("Parent: Protected Constructor");
	}

	ParentClass(float height, double salary) {
		System.out.println("Parent: Default Constructor");
	}

	private ParentClass(boolean haveKids) {
		System.out.println("Parent: Private Constructor");
		parentHaveKids = haveKids;
		System.out.println("Parent Have Kids: " + parentHaveKids);
	}

	{
		System.out.println("Parent: Instance Block");
	}

	static {
		System.out.println("Parent: Static block");
	}

	public void parentPublicMethod() {
		System.out.println("Parent: Public Method");
	}

	protected void parentProtectedMethod() {
		System.out.println("Parent: Protected Method");
	}

	void parentDefaultMethod() {
		System.out.println("Parent: Default Method");
	}

	private void parentPrivateMethod() {
		System.out.println("Parent: Private Method");
	}

	static void staticMethod() {
		System.out.println("Parent: Static Method");
	}

	final void parentFinalMethod() {
		System.out.println("Parent: Final Method");
	}

	public void commonMethod() {
		System.out.println("Parent: Common Method");
	}

	public static void main(String[] args) {
		System.out.println("Parent: main() Method");
		ParentClass parent = new ParentClass(true);
		System.out.println("Parent Height: " + parent.parentHeight);
		parent.parentPrivateMethod();
	}
}