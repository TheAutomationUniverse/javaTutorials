package p002_AccessModifierSamePackage;

// same package - same class - can access all the four access modifiers
public class SamePackageParent {
	public int number1 = 1;
	protected int number2 = 2;
	int number3 = 3;
	private int number4 = 4;

	public static void main(String[] args) {
		SamePackageParent samePackageParent = new SamePackageParent();
		System.out.println(samePackageParent.number1);
		System.out.println(samePackageParent.number2);
		System.out.println(samePackageParent.number3);
		System.out.println(samePackageParent.number4);
	}
}

// -----------------------------------------------------------------
// Modifier     Same Class  Same Package  Other Package  Other Package
//										   Child Class
// -----------------------------------------------------------------
// public           ✅           ✅           ✅           ✅
// protected        ✅           ✅           ✅           ❌
// default          ✅           ✅           ❌           ❌
// private          ✅           ❌           ❌           ❌
// -----------------------------------------------------------------

// Interview Questions
// What are Access Modifiers & Which are these?
// Access Modifiers control the visibility and accessibility of classes, variables, methods and constructors.
// public, protected, default, private

// Which Access Modifiers Are Allowed for a Top-Level Class ? - public and default