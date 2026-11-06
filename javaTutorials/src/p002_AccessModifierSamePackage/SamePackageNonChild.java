package p002_AccessModifierSamePackage;

//same package - both child/non-child classes - can access only public, protected, default
public class SamePackageNonChild {

	public static void main(String[] args) {
		SamePackageParent samePackageParent = new SamePackageParent();
		System.out.println(samePackageParent.number1);
		System.out.println(samePackageParent.number2);
		System.out.println(samePackageParent.number3);
	}
}